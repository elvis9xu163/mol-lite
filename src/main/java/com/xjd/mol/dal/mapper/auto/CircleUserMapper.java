package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.CircleUser;
import com.xjd.mol.dal.domain.auto.CircleUserExample;
import com.xjd.mol.dal.domain.auto.CircleUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleUserMapper {
    int countByExample(CircleUserExample example);

    int deleteByExample(CircleUserExample example);

    int deleteByPrimaryKey(CircleUserKey key);

    int insert(CircleUser record);

    int insertSelective(CircleUser record);

    List<CircleUser> selectByExample(CircleUserExample example);

    CircleUser selectByPrimaryKey(CircleUserKey key);

    int updateByExampleSelective(@Param("record") CircleUser record, @Param("example") CircleUserExample example);

    int updateByExample(@Param("record") CircleUser record, @Param("example") CircleUserExample example);

    int updateByPrimaryKeySelective(CircleUser record);

    int updateByPrimaryKey(CircleUser record);
}