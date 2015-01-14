package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.FriendGroup;
import com.xjd.mol.dal.domain.auto.FriendGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendGroupMapper {
    int countByExample(FriendGroupExample example);

    int deleteByExample(FriendGroupExample example);

    int deleteByPrimaryKey(Long groupId);

    int insert(FriendGroup record);

    int insertSelective(FriendGroup record);

    List<FriendGroup> selectByExample(FriendGroupExample example);

    FriendGroup selectByPrimaryKey(Long groupId);

    int updateByExampleSelective(@Param("record") FriendGroup record, @Param("example") FriendGroupExample example);

    int updateByExample(@Param("record") FriendGroup record, @Param("example") FriendGroupExample example);

    int updateByPrimaryKeySelective(FriendGroup record);

    int updateByPrimaryKey(FriendGroup record);
}