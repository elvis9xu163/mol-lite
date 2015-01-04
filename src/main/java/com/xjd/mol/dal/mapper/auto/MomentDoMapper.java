package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.MomentDo;
import com.xjd.mol.dal.domain.auto.MomentDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MomentDoMapper {
	int countByExample(MomentDoExample example);

	int deleteByExample(MomentDoExample example);

	int deleteByPrimaryKey(Long mntId);

	int insert(MomentDo record);

	int insertSelective(MomentDo record);

	List<MomentDo> selectByExample(MomentDoExample example);

	MomentDo selectByPrimaryKey(Long mntId);

	int updateByExampleSelective(@Param("record") MomentDo record, @Param("example") MomentDoExample example);

	int updateByExample(@Param("record") MomentDo record, @Param("example") MomentDoExample example);

	int updateByPrimaryKeySelective(MomentDo record);

	int updateByPrimaryKey(MomentDo record);
}