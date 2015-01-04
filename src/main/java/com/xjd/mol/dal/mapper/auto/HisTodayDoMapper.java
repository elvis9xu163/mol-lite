package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.HisTodayDo;
import com.xjd.mol.dal.domain.auto.HisTodayDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HisTodayDoMapper {
	int countByExample(HisTodayDoExample example);

	int deleteByExample(HisTodayDoExample example);

	int deleteByPrimaryKey(Long evtId);

	int insert(HisTodayDo record);

	int insertSelective(HisTodayDo record);

	List<HisTodayDo> selectByExample(HisTodayDoExample example);

	HisTodayDo selectByPrimaryKey(Long evtId);

	int updateByExampleSelective(@Param("record") HisTodayDo record, @Param("example") HisTodayDoExample example);

	int updateByExample(@Param("record") HisTodayDo record, @Param("example") HisTodayDoExample example);

	int updateByPrimaryKeySelective(HisTodayDo record);

	int updateByPrimaryKey(HisTodayDo record);
}