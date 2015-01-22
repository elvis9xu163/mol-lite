package com.xjd.mol.bean;

import java.util.Date;

public class MomentUser extends UserInfo {
    private Long mntId;

    private Long userId;

    private String role;

    private String status;

    private String attitude;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
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