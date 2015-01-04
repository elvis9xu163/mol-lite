package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.MomentUserDo;
import com.xjd.mol.dal.domain.auto.MomentUserDoExample;
import com.xjd.mol.dal.domain.auto.MomentUserDoKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MomentUserDoMapper {
	int countByExample(MomentUserDoExample example);

	int deleteByExample(MomentUserDoExample example);

	int deleteByPrimaryKey(MomentUserDoKey key);

	int insert(MomentUserDo record);

	int insertSelective(MomentUserDo record);

	List<MomentUserDo> selectByExample(MomentUserDoExample example);

	MomentUserDo selectByPrimaryKey(MomentUserDoKey key);

	int updateByExampleSelective(@Param("record") MomentUserDo record, @Param("example") MomentUserDoExample example);

	int updateByExample(@Param("record") MomentUserDo record, @Param("example") MomentUserDoExample example);

	int updateByPrimaryKeySelective(MomentUserDo record);

	int updateByPrimaryKey(MomentUserDo record);
}