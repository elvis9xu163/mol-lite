package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.Moment;
import com.xjd.mol.dal.domain.auto.MomentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentMapper {
    int countByExample(MomentExample example);

    int deleteByExample(MomentExample example);

    int deleteByPrimaryKey(Long mntId);

    int insert(Moment record);

    int insertSelective(Moment record);

    List<Moment> selectByExample(MomentExample example);

    Moment selectByPrimaryKey(Long mntId);

    int updateByExampleSelective(@Param("record") Moment record, @Param("example") MomentExample example);

    int updateByExample(@Param("record") Moment record, @Param("example") MomentExample example);

    int updateByPrimaryKeySelective(Moment record);

    int updateByPrimaryKey(Moment record);
}