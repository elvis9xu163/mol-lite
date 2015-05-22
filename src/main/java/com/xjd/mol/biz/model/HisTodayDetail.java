package com.xjd.mol.biz.model;

import java.util.Date;
import java.util.List;

public class HisTodayDetail extends BaseBean {
    private Long evtId;

    private String detail;

    private Date addTime;

    private Date updTime;

    private List<HisTodayResource> resources;

    public Long getEvtId() {
        return evtId;
    }

    public void setEvtId(Long evtId) {
        this.evtId = evtId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public List<HisTodayResource> getResources() {
        return resources;
    }

    public void setResources(List<HisTodayResource> resources) {
        this.resources = resources;
    }
}