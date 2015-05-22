package com.xjd.mol.dal.mapper;

import com.xjd.mol.biz.model.HisTodayResource;
import com.xjd.mol.bean.HisTodayResourceExample;
import com.xjd.mol.bean.HisTodayResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTodayResourceMapper {
    int countByExample(HisTodayResourceExample example);

    int deleteByExample(HisTodayResourceExample example);

    int deleteByPrimaryKey(HisTodayResourceKey key);

    int insert(HisTodayResource record);

    int insertSelective(HisTodayResource record);

    List<HisTodayResource> selectByExample(HisTodayResourceExample example);

    HisTodayResource selectByPrimaryKey(HisTodayResourceKey key);

    int updateByExampleSelective(@Param("record") HisTodayResource record, @Param("example") HisTodayResourceExample example);

    int updateByExample(@Param("record") HisTodayResource record, @Param("example") HisTodayResourceExample example);

    int updateByPrimaryKeySelective(HisTodayResource record);

    int updateByPrimaryKey(HisTodayResource record);
}