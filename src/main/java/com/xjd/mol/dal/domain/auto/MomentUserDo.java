package com.xjd.mol.dal.domain.auto;

import java.util.Date;

public class MomentUserDo extends MomentUserDoKey {
	private String role;

	private String comments;

	private String picRids;

	private String audioRids;

	private String vedioRids;

	private String status;

	private Date addTime;

	private Date updTime;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPicRids() {
		return picRids;
	}

	public void setPicRids(String picRids) {
		this.picRids = picRids;
	}

	public String getAudioRids() {
		return audioRids;
	}

	public void setAudioRids(String audioRids) {
		this.audioRids = audioRids;
	}

	public String getVedioRids() {
		return vedioRids;
	}

	public void setVedioRids(String vedioRids) {
		this.vedioRids = vedioRids;
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