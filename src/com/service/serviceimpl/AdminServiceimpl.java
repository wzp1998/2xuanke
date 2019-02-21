package com.service.serviceimpl;

import com.dao.AdminDao;
import com.entity.Admin;
import com.entity.KeBiao;
import com.entity.KeCheng;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminServiceimpl")
public class AdminServiceimpl implements AdminService {
    @Autowired
    private AdminDao ad;
    @Override
    public Admin selectLoginAdmin(String loginname, String loginpwd) {
        return ad.selectLoginAdmin(loginname,loginpwd);
    }

    @Override
    public int updateAdminPwd(String userName, String userPwd) {
        return ad.updateAdminPwd(userName,userPwd);
    }

    @Override
    public List<KeCheng> selectKecheng() {
        return ad.selectKecheng();
    }

    @Override
    public int insertKecheng(KeCheng kecheng) {
        return ad.insertKecheng(kecheng);
    }

    @Override
    public int deleteKecheng(int id) {
        return ad.deleteKecheng(id);
    }

    @Override
    public int insertKebiao(KeBiao kebiao) {
        return ad.insertKebiao(kebiao);
    }


}
