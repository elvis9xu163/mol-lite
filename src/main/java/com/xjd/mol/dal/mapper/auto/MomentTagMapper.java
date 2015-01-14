package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.MomentTag;
import com.xjd.mol.dal.domain.auto.MomentTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentTagMapper {
    int countByExample(MomentTagExample example);

    int deleteByExample(MomentTagExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(MomentTag record);

    int insertSelective(MomentTag record);

    List<MomentTag> selectByExample(MomentTagExample example);

    MomentTag selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") MomentTag record, @Param("example") MomentTagExample example);

    int updateByExample(@Param("record") MomentTag record, @Param("example") MomentTagExample example);

    int updateByPrimaryKeySelective(MomentTag record);

    int updateByPrimaryKey(MomentTag record);
}