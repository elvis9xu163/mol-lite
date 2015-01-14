package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.HisToday;
import com.xjd.mol.dal.domain.auto.HisTodayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTodayMapper {
    int countByExample(HisTodayExample example);

    int deleteByExample(HisTodayExample example);

    int deleteByPrimaryKey(Long evtId);

    int insert(HisToday record);

    int insertSelective(HisToday record);

    List<HisToday> selectByExample(HisTodayExample example);

    HisToday selectByPrimaryKey(Long evtId);

    int updateByExampleSelective(@Param("record") HisToday record, @Param("example") HisTodayExample example);

    int updateByExample(@Param("record") HisToday record, @Param("example") HisTodayExample example);

    int updateByPrimaryKeySelective(HisToday record);

    int updateByPrimaryKey(HisToday record);
}