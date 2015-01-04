package com.xjd.mol.dal.domain.auto;

import java.util.Date;

public class HisTodayDo {
	private Long evtId;

	private Date evtDate;

	private String evtKey;

	private String tag;

	private String summary;

	private String content;

	private Date addTime;

	private Date updTime;

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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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