package com.xjd.mol.mapper;

import com.xjd.mol.bean.MomentResource;
import com.xjd.mol.bean.MomentResourceExample;
import com.xjd.mol.bean.MomentResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentResourceMapper {
    int countByExample(MomentResourceExample example);

    int deleteByExample(MomentResourceExample example);

    int deleteByPrimaryKey(MomentResourceKey key);

    int insert(MomentResource record);

    int insertSelective(MomentResource record);

    List<MomentResource> selectByExample(MomentResourceExample example);

    MomentResource selectByPrimaryKey(MomentResourceKey key);

    int updateByExampleSelective(@Param("record") MomentResource record, @Param("example") MomentResourceExample example);

    int updateByExample(@Param("record") MomentResource record, @Param("example") MomentResourceExample example);

    int updateByPrimaryKeySelective(MomentResource record);

    int updateByPrimaryKey(MomentResource record);
}