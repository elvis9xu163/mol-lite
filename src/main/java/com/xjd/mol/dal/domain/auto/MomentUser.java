package com.xjd.mol.dal.domain.auto;

import java.util.Date;

public class MomentUser extends MomentUserKey {
    private String role;

    private String relationStatus;

    private String comments;

    private String picReses;

    private String audioReses;

    private String vedioReses;

    private String userAttitude;

    private Date addTime;

    private Date updTime;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRelationStatus() {
        return relationStatus;
    }

    public void setRelationStatus(String relationStatus) {
        this.relationStatus = relationStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public String getUserAttitude() {
        return userAttitude;
    }

    public void setUserAttitude(String userAttitude) {
        this.userAttitude = userAttitude;
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