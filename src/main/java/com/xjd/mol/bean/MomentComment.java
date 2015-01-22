package com.xjd.mol.bean;

import java.util.Date;

public class MomentComment extends BaseBean {
    private Long cmtId;

    private Long mntId;

    private Long userId;

    private String comment;

    private Date addTime;

    private Date updTime;

    public Long getCmtId() {
        return cmtId;
    }

    public void setCmtId(Long cmtId) {
        this.cmtId = cmtId;
    }

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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