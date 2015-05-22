package com.xjd.mol.dal.mapper;

import com.xjd.mol.biz.model.HisTodayDetail;
import com.xjd.mol.bean.HisTodayDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisTodayDetailMapper {
    int countByExample(HisTodayDetailExample example);

    int deleteByExample(HisTodayDetailExample example);

    int deleteByPrimaryKey(Long evtId);

    int insert(HisTodayDetail record);

    int insertSelective(HisTodayDetail record);

    List<HisTodayDetail> selectByExample(HisTodayDetailExample example);

    HisTodayDetail selectByPrimaryKey(Long evtId);

    int updateByExampleSelective(@Param("record") HisTodayDetail record, @Param("example") HisTodayDetailExample example);

    int updateByExample(@Param("record") HisTodayDetail record, @Param("example") HisTodayDetailExample example);

    int updateByPrimaryKeySelective(HisTodayDetail record);

    int updateByPrimaryKey(HisTodayDetail record);
}