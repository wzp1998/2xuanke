package com.dao;

import com.entity.KeBiao;
import com.entity.Student;


import java.util.List;


public interface StudentDao {
   /*学生登录*/
    public Student selectLoginStudent(String loginname , String loginpwd);

  /*多表查学生课表*/
    public List<KeBiao> selectStudentKeBiao();
    /*多表查学生选课*/
    public List<KeBiao> selectStudentXuanKe(int id);

    /*学生管理*/
    public List<Student> selectStudentXinxi();

    /*学生录入*/
    public int insertStudent(Student student);
    /*删除*/
    public int deleteStudent(int id);

}
