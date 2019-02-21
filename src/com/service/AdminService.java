package com.service;

import com.entity.Admin;
import com.entity.KeBiao;
import com.entity.KeCheng;

import java.util.List;

public interface AdminService {
  /* 登录*/
    public Admin selectLoginAdmin(String loginname , String loginpwd);

    /*修改密码*/
    public int updateAdminPwd(String userName,String userPwd );

    /*课程管理*/
    public List<KeCheng> selectKecheng();

    /*课程录入*/
    public int insertKecheng(KeCheng kecheng);

  /*删除课程*/
  public int deleteKecheng(int id);

  /*课表录入*/
  public int insertKebiao(KeBiao kebiao);
}
