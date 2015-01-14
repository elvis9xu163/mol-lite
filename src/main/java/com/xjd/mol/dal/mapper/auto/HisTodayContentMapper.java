package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.HisTodayContent;
import com.xjd.mol.dal.domain.auto.HisTodayContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTodayContentMapper {
    int countByExample(HisTodayContentExample example);

    int deleteByExample(HisTodayContentExample example);

    int deleteByPrimaryKey(Long evtId);

    int insert(HisTodayContent record);

    int insertSelective(HisTodayContent record);

    List<HisTodayContent> selectByExample(HisTodayContentExample example);

    HisTodayContent selectByPrimaryKey(Long evtId);

    int updateByExampleSelective(@Param("record") HisTodayContent record, @Param("example") HisTodayContentExample example);

    int updateByExample(@Param("record") HisTodayContent record, @Param("example") HisTodayContentExample example);

    int updateByPrimaryKeySelective(HisTodayContent record);

    int updateByPrimaryKey(HisTodayContent record);
}