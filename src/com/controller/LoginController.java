package com.controller;

import com.entity.Admin;
import com.entity.Student;
import com.entity.Teacher;
import com.service.AdminService;
import com.service.StudentService;
import com.service.TeacherService;
import com.service.serviceimpl.StudentServiceimpl;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;
import java.util.List;

@Controller
@RemoteProxy
@SessionAttributes(value = {"student","teacher","admin"},types = {Student.class,Teacher.class,Admin.class})
public class LoginController {

    @Resource
    @Qualifier("StudentServiceimpl")
    private StudentService studentService;
    @Resource
    @Qualifier("AdminServiceimpl")
    private AdminService adminService;
    @Resource
    @Qualifier("TeacherServiceimpl")
    private TeacherService teacherService;


    @RemoteMethod
    /*登录*/
    public String login(String userName, String userPw, String userType) {


        int UserType = Integer.parseInt(userType);
        HttpSession session = WebContextFactory.get().getSession();
        session.setAttribute("UserType", UserType);
        if (UserType == 0) {

            Admin admin = adminService.selectLoginAdmin(userName, userPw);

            if (admin != null) {
                session.setAttribute("admin", admin);
               // session.setAttribute("adminUserName", admin.getUserName());
                session.setAttribute("username",admin.getUserName());
                return "yes";
            }

        } else if (UserType == 1) {
            Teacher teacher = teacherService.selectLoginTeacher(userName, userPw);
           // System.out.println(teacher.getLoginName() + "=========" + teacher.getLoginPw() + "==" + teacher.getBianHao());
            if (teacher != null) {
                session.setAttribute("teacher", teacher);
             //   session.setAttribute("xingbieT", teacher.getXingBie());
                return "yes";
            }
        } else if (UserType == 2) {
            Student student = studentService.selectLoginStudent(userName, userPw);
            // System.out.println(student.getLoginName()+"========="+student.getLoginPw()+"========="+student.getXingBie());
            if (student != null) {
                session.setAttribute("student", student);
              //  session.setAttribute("xingbieS", student.getXingBie());
               session.setAttribute("id", student.getId());
                //System.out.println(student.getXingMing());
                return "yes";
            }
        }

        return "no";

    }
    /*修改密码*/

    public String adminPwEdit(String userPwd){

        HttpSession session = WebContextFactory.get().getSession();
        String username = (String) session.getAttribute("username");
        int i = adminService.updateAdminPwd(userPwd, username);

        return "0";
    }

}