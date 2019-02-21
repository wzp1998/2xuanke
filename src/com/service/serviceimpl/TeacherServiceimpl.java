package com.service.serviceimpl;


import com.dao.TeacherDao;
import com.entity.Teacher;
import com.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeacherServiceimpl")
public class TeacherServiceimpl implements TeacherService {

    @Autowired

    private TeacherDao td;

    @Override
    public Teacher selectLoginTeacher(String loginname, String loginpwd) {
        return td.selectLoginTeacher(loginname,loginpwd);
    }

    @Override
    public List<Teacher> selectTeacherXinxi() {
        return td.selectTeacherXinxi();
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        return td.insertTeacher(teacher);
    }

    @Override
    public int deleteTeacher(int id) {
        return td.deleteTeacher(id);
    }


}
