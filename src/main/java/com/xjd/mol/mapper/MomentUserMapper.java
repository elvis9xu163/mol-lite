package com.xjd.mol.mapper;

import com.xjd.mol.bean.MomentUser;
import com.xjd.mol.bean.MomentUserExample;
import com.xjd.mol.bean.MomentUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentUserMapper {
    int countByExample(MomentUserExample example);

    int deleteByExample(MomentUserExample example);

    int deleteByPrimaryKey(MomentUserKey key);

    int insert(MomentUser record);

    int insertSelective(MomentUser record);

    List<MomentUser> selectByExample(MomentUserExample example);

    MomentUser selectByPrimaryKey(MomentUserKey key);

    int updateByExampleSelective(@Param("record") MomentUser record, @Param("example") MomentUserExample example);

    int updateByExample(@Param("record") MomentUser record, @Param("example") MomentUserExample example);

    int updateByPrimaryKeySelective(MomentUser record);

    int updateByPrimaryKey(MomentUser record);
}