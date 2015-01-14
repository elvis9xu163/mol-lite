package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.HisTodayTagRelationExample;
import com.xjd.mol.dal.domain.auto.HisTodayTagRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTodayTagRelationMapper {
    int countByExample(HisTodayTagRelationExample example);

    int deleteByExample(HisTodayTagRelationExample example);

    int deleteByPrimaryKey(HisTodayTagRelationKey key);

    int insert(HisTodayTagRelationKey record);

    int insertSelective(HisTodayTagRelationKey record);

    List<HisTodayTagRelationKey> selectByExample(HisTodayTagRelationExample example);

    int updateByExampleSelective(@Param("record") HisTodayTagRelationKey record, @Param("example") HisTodayTagRelationExample example);

    int updateByExample(@Param("record") HisTodayTagRelationKey record, @Param("example") HisTodayTagRelationExample example);
}