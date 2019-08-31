package com.gagko.project.selectTest.service;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gagko.project.selectTest.vo.VO;

@Service("dao")
public class DAO {
	@Autowired
	private SqlSession sqlSession;
	
	
	public SqlSession getTemplate() {
		return sqlSession;
	}


	public void setTemplate(SqlSession template) {
		sqlSession = template;
	}
	
	public List<VO> selectTestList(){
		return sqlSession.selectList("testMapper.selectTestList");
	}
	
}
