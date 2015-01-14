package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.HisTag;
import com.xjd.mol.dal.domain.auto.HisTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTagMapper {
    int countByExample(HisTagExample example);

    int deleteByExample(HisTagExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(HisTag record);

    int insertSelective(HisTag record);

    List<HisTag> selectByExample(HisTagExample example);

    HisTag selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") HisTag record, @Param("example") HisTagExample example);

    int updateByExample(@Param("record") HisTag record, @Param("example") HisTagExample example);

    int updateByPrimaryKeySelective(HisTag record);

    int updateByPrimaryKey(HisTag record);
}