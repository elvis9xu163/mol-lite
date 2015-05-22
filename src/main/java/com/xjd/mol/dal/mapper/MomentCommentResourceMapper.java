package com.xjd.mol.dal.mapper;

import com.xjd.mol.biz.model.MomentCommentResource;
import com.xjd.mol.bean.MomentCommentResourceExample;
import com.xjd.mol.bean.MomentCommentResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentCommentResourceMapper {
    int countByExample(MomentCommentResourceExample example);

    int deleteByExample(MomentCommentResourceExample example);

    int deleteByPrimaryKey(MomentCommentResourceKey key);

    int insert(MomentCommentResource record);

    int insertSelective(MomentCommentResource record);

    List<MomentCommentResource> selectByExample(MomentCommentResourceExample example);

    MomentCommentResource selectByPrimaryKey(MomentCommentResourceKey key);

    int updateByExampleSelective(@Param("record") MomentCommentResource record, @Param("example") MomentCommentResourceExample example);

    int updateByExample(@Param("record") MomentCommentResource record, @Param("example") MomentCommentResourceExample example);

    int updateByPrimaryKeySelective(MomentCommentResource record);

    int updateByPrimaryKey(MomentCommentResource record);
}