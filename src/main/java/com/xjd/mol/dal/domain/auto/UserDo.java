package com.xjd.mol.dal.domain.auto;

import java.util.Date;

public class UserDo {
	private Long userId;

	private String email;

	private String mobile;

	private String pwd;

	private String nickName;

	private Long iconRid;

	private Integer grade;

	private Date birthDay;

	private Date birthTime;

	private String gender;

	private String hometown;

	private String beenToPlace;

	private String currentPlace;

	private String career;

	private String hobby;

	private Date lastLoginDatetime;

	private String lastLoginAddr;

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Long getIconRid() {
		return iconRid;
	}

	public void setIconRid(Long iconRid) {
		this.iconRid = iconRid;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Date getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(Date birthTime) {
		this.birthTime = birthTime;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getBeenToPlace() {
		return beenToPlace;
	}

	public void setBeenToPlace(String beenToPlace) {
		this.beenToPlace = beenToPlace;
	}

	public String getCurrentPlace() {
		return currentPlace;
	}

	public void setCurrentPlace(String currentPlace) {
		this.currentPlace = currentPlace;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getLastLoginDatetime() {
		return lastLoginDatetime;
	}

	public void setLastLoginDatetime(Date lastLoginDatetime) {
		this.lastLoginDatetime = lastLoginDatetime;
	}

	public String getLastLoginAddr() {
		return lastLoginAddr;
	}

	public void setLastLoginAddr(String lastLoginAddr) {
		this.lastLoginAddr = lastLoginAddr;
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