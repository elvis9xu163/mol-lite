package com.xjd.mol.biz.model;

import java.util.Date;

public class Calendar extends BaseBean {
    private Date solarDate;

    private Date lunarDate;

    private Boolean weekDay;

    private String festival;

    private Boolean needWork;

    public Date getSolarDate() {
        return solarDate;
    }

    public void setSolarDate(Date solarDate) {
        this.solarDate = solarDate;
    }

    public Date getLunarDate() {
        return lunarDate;
    }

    public void setLunarDate(Date lunarDate) {
        this.lunarDate = lunarDate;
    }

    public Boolean getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Boolean weekDay) {
        this.weekDay = weekDay;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public Boolean getNeedWork() {
        return needWork;
    }

    public void setNeedWork(Boolean needWork) {
        this.needWork = needWork;
    }
}