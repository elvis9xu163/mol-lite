package com.xjd.mol.bean;

import java.util.Date;

public class UserAuth extends BaseBean {
    private Long userId;

    private String email;

    private String mobile;

    private String pwd;

    private Date lastLoginTime;

    private String lastLoginIp;

    private Double lastLoginLng;

    private Double lastLoginLat;

    private Date addTime;

    private Date updTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Double getLastLoginLng() {
        return lastLoginLng;
    }

    public void setLastLoginLng(Double lastLoginLng) {
        this.lastLoginLng = lastLoginLng;
    }

    public Double getLastLoginLat() {
        return lastLoginLat;
    }

    public void setLastLoginLat(Double lastLoginLat) {
        this.lastLoginLat = lastLoginLat;
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