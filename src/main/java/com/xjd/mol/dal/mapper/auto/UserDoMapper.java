package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.UserDo;
import com.xjd.mol.dal.domain.auto.UserDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDoMapper {
	int countByExample(UserDoExample example);

	int deleteByExample(UserDoExample example);

	int deleteByPrimaryKey(Long userId);

	int insert(UserDo record);

	int insertSelective(UserDo record);

	List<UserDo> selectByExample(UserDoExample example);

	UserDo selectByPrimaryKey(Long userId);

	int updateByExampleSelective(@Param("record") UserDo record, @Param("example") UserDoExample example);

	int updateByExample(@Param("record") UserDo record, @Param("example") UserDoExample example);

	int updateByPrimaryKeySelective(UserDo record);

	int updateByPrimaryKey(UserDo record);
}