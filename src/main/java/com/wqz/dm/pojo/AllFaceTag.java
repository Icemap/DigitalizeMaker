package com.wqz.dm.pojo;

import java.util.Date;

import com.wqz.dm.pojo2.AllFace;

public class AllFaceTag {
    private Integer id;

    private Integer cameraid;

    private String picurl;

    private Byte ismale;

    private Integer age;

    private Date datetime;

    private Long sametag;

    private Byte humantag;

    private Integer agetag;

    private Byte ismaletag;

    public AllFaceTag()
    {
    	
    }
    
    public AllFaceTag(AllFace allFace)
    {
    	this.id = allFace.getId();
    	this.cameraid = allFace.getCameraid();
    	this.picurl = allFace.getPicurl();
    	this.ismale = allFace.getIsmale();
    	this.age = allFace.getAge();
    	this.datetime = allFace.getDatetime();
    }
    
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

    public Long getSametag() {
        return sametag;
    }

    public void setSametag(Long sametag) {
        this.sametag = sametag;
    }

    public Byte getHumantag() {
        return humantag;
    }

    public void setHumantag(Byte humantag) {
        this.humantag = humantag;
    }

    public Integer getAgetag() {
        return agetag;
    }

    public void setAgetag(Integer agetag) {
        this.agetag = agetag;
    }

    public Byte getIsmaletag() {
        return ismaletag;
    }

    public void setIsmaletag(Byte ismaletag) {
        this.ismaletag = ismaletag;
    }
}