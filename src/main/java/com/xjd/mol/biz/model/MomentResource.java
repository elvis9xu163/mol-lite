package com.xjd.mol.biz.model;

import java.util.Date;

public class MomentResource extends Resource {
	private Long mntId;

	private Long resId;

	private String resType;

	private Date addTime;

	private Date updTime;

	public Long getMntId() {
		return mntId;
	}

	public void setMntId(Long mntId) {
		this.mntId = mntId;
	}

	public Long getResId() {
		return resId;
	}

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