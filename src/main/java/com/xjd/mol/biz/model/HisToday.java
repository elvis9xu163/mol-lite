package com.xjd.mol.biz.model;

import java.util.Date;
import java.util.List;

public class HisToday extends BaseBean {
    private Long evtId;

    private Date evtDate;

    private String evtKey;

    private Long resId;

    private String summary;

    private Date addTime;

    private Date updTime;

    private List<HisTag> tags;

    public Long getEvtId() {
        return evtId;
    }

    public void setEvtId(Long evtId) {
        this.evtId = evtId;
    }

    public Date getEvtDate() {
        return evtDate;
    }

    public void setEvtDate(Date evtDate) {
        this.evtDate = evtDate;
    }

    public String getEvtKey() {
        return evtKey;
    }

    public void setEvtKey(String evtKey) {
        this.evtKey = evtKey;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public List<HisTag> getTags() {
        return tags;
    }

    public void setTags(List<HisTag> tags) {
        this.tags = tags;
    }
}