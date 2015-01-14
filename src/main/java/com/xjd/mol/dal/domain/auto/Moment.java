package com.xjd.mol.dal.domain.auto;

import java.util.Date;

public class Moment {
    private Long mntId;

    private Long userId;

    private Date startDay;

    private Date startTime;

    private Date endDay;

    private Date endTime;

    private String locAddr;

    private Double locLng;

    private Double locLat;

    private String subject;

    private String descText;

    private String picReses;

    private String audioReses;

    private String vedioReses;

    private String status;

    private Date addTime;

    private Date updTime;

    public Long getMntId() {
        return mntId;
    }

    public void setMntId(Long mntId) {
        this.mntId = mntId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocAddr() {
        return locAddr;
    }

    public void setLocAddr(String locAddr) {
        this.locAddr = locAddr;
    }

    public Double getLocLng() {
        return locLng;
    }

    public void setLocLng(Double locLng) {
        this.locLng = locLng;
    }

    public Double getLocLat() {
        return locLat;
    }

    public void setLocLat(Double locLat) {
        this.locLat = locLat;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescText() {
        return descText;
    }

    public void setDescText(String descText) {
        this.descText = descText;
    }

    public String getPicReses() {
        return picReses;
    }

    public void setPicReses(String picReses) {
        this.picReses = picReses;
    }

    public String getAudioReses() {
        return audioReses;
    }

    public void setAudioReses(String audioReses) {
        this.audioReses = audioReses;
    }

    public String getVedioReses() {
        return vedioReses;
    }

    public void setVedioReses(String vedioReses) {
        this.vedioReses = vedioReses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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