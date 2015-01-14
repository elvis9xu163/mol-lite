package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.Circle;
import com.xjd.mol.dal.domain.auto.CircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleMapper {
    int countByExample(CircleExample example);

    int deleteByExample(CircleExample example);

    int deleteByPrimaryKey(Long circleId);

    int insert(Circle record);

    int insertSelective(Circle record);

    List<Circle> selectByExample(CircleExample example);

    Circle selectByPrimaryKey(Long circleId);

    int updateByExampleSelective(@Param("record") Circle record, @Param("example") CircleExample example);

    int updateByExample(@Param("record") Circle record, @Param("example") CircleExample example);

    int updateByPrimaryKeySelective(Circle record);

    int updateByPrimaryKey(Circle record);
}