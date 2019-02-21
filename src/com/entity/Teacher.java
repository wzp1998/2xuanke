package com.entity;

public class Teacher {
    private Integer id;
    private String bianhao;
    private String xingming;
    private String xingbie;
    private String nianling;
    private String zhicheng;
    private String loginname;
    private String loginpwd;
    private String del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getNianling() {
        return nianling;
    }

    public void setNianling(String nianling) {
        this.nianling = nianling;
    }

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public Teacher() {
        super();
    }

    public Teacher(Integer id, String loginname, String loginpwd) {
        this.id = id;
        this.loginname = loginname;
        this.loginpwd = loginpwd;
    }

    public Teacher(String bianhao, String xingming, String xingbie, String nianling, String zhicheng, String loginname, String loginpwd) {
        this.bianhao = bianhao;
        this.xingming = xingming;
        this.xingbie = xingbie;
        this.nianling = nianling;
        this.zhicheng = zhicheng;
        this.loginname = loginname;
        this.loginpwd = loginpwd;
    }
}
