package com.cadio.common.repositroy;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;


public abstract class Repositorys implements CRUDRepository,SearchRepository{
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	protected String ns;
	
	@Override
	public List<Object> searchList(Object dto) throws Exception {
		return sqlSession.selectList(ns, dto); 
	}
 
	@Override
	public Integer create(Object dto) throws Exception {
		return sqlSession.insert(ns, dto);
	}

	@Override
	public Object read(Object dto) throws Exception {
		return sqlSession.selectOne(ns, dto);
	}

	@Override
	public Integer update(Object dto) throws Exception {
		return sqlSession.update(ns, dto);
	}

	@Override
	public Integer delete(Object dto) throws Exception {
		return sqlSession.delete(ns,dto);
	}  

	@Override
	public List<Object> list() throws Exception {
		return sqlSession.selectList(ns);
	}
	 
	protected abstract void setNameSpace(String queryId);
}
