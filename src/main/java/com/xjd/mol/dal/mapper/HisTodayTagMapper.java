package com.xjd.mol.dal.mapper;

import com.xjd.mol.biz.model.HisTodayTag;
import com.xjd.mol.bean.HisTodayTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTodayTagMapper {
    int countByExample(HisTodayTagExample example);

    int deleteByExample(HisTodayTagExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(HisTodayTag record);

    int insertSelective(HisTodayTag record);

    List<HisTodayTag> selectByExample(HisTodayTagExample example);

    HisTodayTag selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") HisTodayTag record, @Param("example") HisTodayTagExample example);

    int updateByExample(@Param("record") HisTodayTag record, @Param("example") HisTodayTagExample example);

    int updateByPrimaryKeySelective(HisTodayTag record);

    int updateByPrimaryKey(HisTodayTag record);
}