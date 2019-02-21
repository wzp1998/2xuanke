package com.entity;

public class KeCheng {
    private Integer id;
    private String bianhao;
    private String mingcheng;
    private String keshi;
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

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public String getKeshi() {
        return keshi;
    }

    public void setKeshi(String keshi) {
        this.keshi = keshi;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public KeCheng(String bianhao, String mingcheng, String keshi) {
        this.bianhao = bianhao;
        this.mingcheng = mingcheng;
        this.keshi = keshi;
    }

    public KeCheng() {
        super();
    }
}
