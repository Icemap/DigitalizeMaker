package com.wqz.dm.pojo2;

import java.util.Date;

public class AllFace {
    private Integer id;

    private Integer cameraid;

    private String picurl;

    private Byte ismale;

    private Integer age;

    private Date datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCameraid() {
        return cameraid;
    }

    public void setCameraid(Integer cameraid) {
        this.cameraid = cameraid;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public Byte getIsmale() {
        return ismale;
    }

    public void setIsmale(Byte ismale) {
        this.ismale = ismale;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}