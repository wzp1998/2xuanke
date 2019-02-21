package com.dao;

import com.entity.Teacher;

import java.util.List;


public interface TeacherDao {
   /*老师登录*/
    public Teacher selectLoginTeacher(String loginname,String loginpwd);
    /*老师管理*/
    public List<Teacher> selectTeacherXinxi();
    /*老师录入*/
    public int insertTeacher(Teacher teacher);
    /*删除*/
    public int deleteTeacher(int id);


}
