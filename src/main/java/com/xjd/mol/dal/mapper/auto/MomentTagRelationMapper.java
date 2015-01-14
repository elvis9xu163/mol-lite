package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.MomentTagRelationExample;
import com.xjd.mol.dal.domain.auto.MomentTagRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentTagRelationMapper {
    int countByExample(MomentTagRelationExample example);

    int deleteByExample(MomentTagRelationExample example);

    int deleteByPrimaryKey(MomentTagRelationKey key);

    int insert(MomentTagRelationKey record);

    int insertSelective(MomentTagRelationKey record);

    List<MomentTagRelationKey> selectByExample(MomentTagRelationExample example);

    int updateByExampleSelective(@Param("record") MomentTagRelationKey record, @Param("example") MomentTagRelationExample example);

    int updateByExample(@Param("record") MomentTagRelationKey record, @Param("example") MomentTagRelationExample example);
}