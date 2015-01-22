package com.xjd.mol.mapper;

import com.xjd.mol.bean.MomentComment;
import com.xjd.mol.bean.MomentCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentCommentMapper {
    int countByExample(MomentCommentExample example);

    int deleteByExample(MomentCommentExample example);

    int deleteByPrimaryKey(Long cmtId);

    int insert(MomentComment record);

    int insertSelective(MomentComment record);

    List<MomentComment> selectByExample(MomentCommentExample example);

    MomentComment selectByPrimaryKey(Long cmtId);

    int updateByExampleSelective(@Param("record") MomentComment record, @Param("example") MomentCommentExample example);

    int updateByExample(@Param("record") MomentComment record, @Param("example") MomentCommentExample example);

    int updateByPrimaryKeySelective(MomentComment record);

    int updateByPrimaryKey(MomentComment record);
}