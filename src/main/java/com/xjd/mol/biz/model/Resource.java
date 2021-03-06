package com.xjd.mol.biz.model;

import java.util.Date;

public class Resource extends BaseBean {
    private Long resId;

    private String resClass;

    private String resFormat;

    private Long resSize;

    private String resMd5;

    private String pathType;

    private String pathContent;

    private String accessKey;

    private Date addTime;

    private Date updTime;

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResClass() {
        return resClass;
    }

    public void setResClass(String resClass) {
        this.resClass = resClass;
    }

    public String getResFormat() {
        return resFormat;
    }

    public void setResFormat(String resFormat) {
        this.resFormat = resFormat;
    }

    public Long getResSize() {
        return resSize;
    }

    public void setResSize(Long resSize) {
        this.resSize = resSize;
    }

    public String getResMd5() {
        return resMd5;
    }

    public void setResMd5(String resMd5) {
        this.resMd5 = resMd5;
    }

    public String getPathType() {
        return pathType;
    }

    public void setPathType(String pathType) {
        this.pathType = pathType;
    }

    public String getPathContent() {
        return pathContent;
    }

    public void setPathContent(String pathContent) {
        this.pathContent = pathContent;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}