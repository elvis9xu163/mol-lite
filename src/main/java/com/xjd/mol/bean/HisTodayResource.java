package com.xjd.mol.bean;

import java.util.Date;

public class HisTodayResource extends Resource {
    private Long evtId;

    private Long resId;

    private String resType;

    private Date addTime;

    private Date updTime;

    public Long getEvtId() {
        return evtId;
    }

    public void setEvtId(Long evtId) {
        this.evtId = evtId;
    }

    @Override
    public Long getResId() {
        return resId;
    }

    @Override
    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
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