package com.xjd.mol.dal.mapper.auto;

import com.xjd.mol.dal.domain.auto.TokenDo;
import com.xjd.mol.dal.domain.auto.TokenDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TokenDoMapper {
	int countByExample(TokenDoExample example);

	int deleteByExample(TokenDoExample example);

	int deleteByPrimaryKey(String token);

	int insert(TokenDo record);

	int insertSelective(TokenDo record);

	List<TokenDo> selectByExample(TokenDoExample example);

	TokenDo selectByPrimaryKey(String token);

	int updateByExampleSelective(@Param("record") TokenDo record, @Param("example") TokenDoExample example);

	int updateByExample(@Param("record") TokenDo record, @Param("example") TokenDoExample example);

	int updateByPrimaryKeySelective(TokenDo record);

	int updateByPrimaryKey(TokenDo record);
}