package com.controller;

import com.entity.KeBiao;
import com.entity.KeCheng;
import com.entity.Student;
import com.entity.Teacher;
import com.service.AdminService;
import com.service.StudentService;
import com.service.TeacherService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class KebiaoChaxunController {
    @Resource
    @Qualifier("StudentServiceimpl")
    private StudentService studentService;
    @Resource
    @Qualifier("TeacherServiceimpl")
    private TeacherService teacherService;
    @Resource
    @Qualifier("AdminServiceimpl")
    private AdminService adminService;

    @RequestMapping(value = "kebiao",method =RequestMethod.GET)
    public String kebiao(String type,Model model,HttpSession session){
        if(type.equals("kebiaoAll1")){
        List<KeBiao> kebiaolist=studentService.selectStudentKeBiao();
        model.addAttribute("kebiaolist",kebiaolist);
        return "admin/kebiao/kebiaoAll";
    }else if(type.equals("kebiao_mana_stu")){
            int id=(int)session.getAttribute("id");
            List<KeBiao> xuankelist=studentService.selectStudentXuanKe(id);
            model.addAttribute("xuankelist",xuankelist);
            System.out.println(id);
            return "axuesheng/kebiao/kebiao_mana_stu";
        }else if(type.equals("kechengMana")){//课程管理
          List<KeCheng> kechenglist= adminService.selectKecheng();
          model.addAttribute("kechenglist",kechenglist);
            return"admin/kecheng/kechengMana";
        }else if(type.equals("kebiaoMana")){//课表管理
            List<KeBiao> kebiaolist=studentService.selectStudentKeBiao();
            model.addAttribute("kebiaolist",kebiaolist);
            return "admin/kebiao/kebiaoMana";
        }
    return "";
    }
    //课表录入
    @RequestMapping("kebiaoAdd")
    public String kebiaoAdd(int kecheng_id,String shijian,String jieci,String jiaoshi,int laoshi_id){
        KeBiao keBiao=new KeBiao(kecheng_id,shijian,jieci,jiaoshi,laoshi_id);


            int k=adminService.insertKebiao(keBiao);
        return"redirect:kebiao?type=kebiaoMana";

    }

    @RequestMapping("findLsKc")
    public String FindLsKc(Model model){
        List<KeCheng> laoshiList=adminService.selectKecheng();
        List<Teacher> kechengList=teacherService.selectTeacherXinxi();
        model.addAttribute("laoshiList",laoshiList);
        model.addAttribute("kechengList",kechengList);
        return "/admin/kebiao/kebiaoAdd";

    }

    //课程录入
    @RequestMapping("add")
    public String addkecheng(String bianhao,String mingcheng,String keshi){
       KeCheng kecheng= new KeCheng(bianhao,mingcheng,keshi);
         int a = adminService.insertKecheng(kecheng);
           return "redirect:kebiao?type=kechengMana";

    }


    //课程删除
    @RequestMapping("del")
    public  String deletekecheng(int id){
        int d=adminService.deleteKecheng(id);
        return"redirect:kebiao?type=kechengMana";
    }
    /*老师管理*/
    @RequestMapping("laoshi")
    public String laoshi(Model model){
        List<Teacher> teacherslist=teacherService.selectTeacherXinxi();
        model.addAttribute("teacherslist",teacherslist);
        return "admin/laoshi/laoshiMana";
    }
    /*老师录入*/
    @RequestMapping("laoshiAdd")
    public  String laoshiAdd(String bianhao,String xingming,String xingbie,String nianling,String zhicheng,String loginname,String loginpwd){
        Teacher teacher=new Teacher(bianhao,xingming,xingbie,nianling,zhicheng,loginname,loginpwd);
        int t=teacherService.insertTeacher(teacher);
        return "redirect:laoshi";

    }

    /*老师删除*/
    @RequestMapping("laoshidel")
    public  String laoshidel(int id){
        int d=teacherService.deleteTeacher(id);
        return "redirect:laoshi";
    }
    /*学生管理*/
    @RequestMapping("xuesheng")
    public String xuesheng(Model model){
       List<Student> studentlist= studentService.selectStudentXinxi();
       model.addAttribute("studentlist",studentlist);
        return "admin/xuesheng/xueshengMana";
    }
    /*学生录入*/
    @RequestMapping("xueshengAdd")
    public  String xueshengAdd(String xuehao,String xingming,String xingbie,String nianling,String banji,String loginname,String loginpw){
        Student student=new Student(xuehao,xingming,xingbie,nianling,banji,loginname,loginpw);
        int s=studentService.insertStudent(student);
        return "redirect:xuesheng";
    }
    /*学生删除*/
    @RequestMapping("xueshengdel")
    public  String xueshengdel(int id){
       int s= studentService.deleteStudent(id);
        return "redirect:xuesheng";
    }
}
