package com.xjd.mol.dal.mapper;

import com.xjd.mol.biz.model.Calendar;
import com.xjd.mol.bean.CalendarExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CalendarMapper {
    int countByExample(CalendarExample example);

    int deleteByExample(CalendarExample example);

    int deleteByPrimaryKey(Date solarDate);

    int insert(Calendar record);

    int insertSelective(Calendar record);

    List<Calendar> selectByExample(CalendarExample example);

    Calendar selectByPrimaryKey(Date solarDate);

    int updateByExampleSelective(@Param("record") Calendar record, @Param("example") CalendarExample example);

    int updateByExample(@Param("record") Calendar record, @Param("example") CalendarExample example);

    int updateByPrimaryKeySelective(Calendar record);

    int updateByPrimaryKey(Calendar record);
}