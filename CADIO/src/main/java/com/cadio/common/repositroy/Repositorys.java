package com.cadio.common.repositroy;

import java.util.Arrays;
import java.util.List;


public abstract class Repositorys implements CRUDRepository,SearchRepository{
 
	protected String ns;

	
	@Override
	public List<Object> searchList(Object obj) throws Exception {
		return Arrays.asList("TEST","S","D"); 
	}
 
	@Override
	public Integer create(Object dto) throws Exception {
		return null;
	}

	@Override
	public Object read(Object dto) throws Exception {
		return null;
	}

	@Override
	public Integer update(Object dto) throws Exception {
		return null;
	}

	@Override
	public Integer delete(Object dto) throws Exception {
		return null;
	}

	@Override
	public List<Object> list() throws Exception {
		return Arrays.asList("TEST","S","D");
	}
	
	protected abstract void setNameSpace(String queryId);
}
