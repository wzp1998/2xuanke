package com.service.serviceimpl;

import com.dao.StudentDao;
import com.entity.KeBiao;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentServiceimpl")
public class StudentServiceimpl implements StudentService {

    @Autowired

    private StudentDao sd;
    @Override
    public Student selectLoginStudent(String loginname, String loginpwd) {
        return sd.selectLoginStudent(loginname,loginpwd);
    }

   @Override
    public List<KeBiao> selectStudentKeBiao() {
        return sd.selectStudentKeBiao();
    }

     @Override
    public List<KeBiao> selectStudentXuanKe(int id) {
        return sd.selectStudentXuanKe(id);
    }

    @Override
    public List<Student> selectStudentXinxi() {
        return sd.selectStudentXinxi();
    }

    @Override
    public int insertStudent(Student student) {
        return sd.insertStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return sd.deleteStudent(id);
    }

}
