package com.xjd.mol.dal.domain.auto;

import java.util.Date;

public class Calendar {
    private Date solarDate;

    private Date lunarDate;

    private Byte weekDay;

    private String festival;

    private Byte needWork;

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

    public Byte getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Byte weekDay) {
        this.weekDay = weekDay;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public Byte getNeedWork() {
        return needWork;
    }

    public void setNeedWork(Byte needWork) {
        this.needWork = needWork;
    }
}