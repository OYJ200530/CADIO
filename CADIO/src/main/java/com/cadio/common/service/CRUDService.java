package com.cadio.common.service;

import java.util.List;

public interface CRUDService {
	
	public abstract Integer register(Object dto) throws Exception;
	public abstract Object getOne(Object dto) throws Exception;
	public abstract Integer modify(Object dto) throws Exception;
	public abstract Integer destroy(Object dto) throws Exception;
	public abstract List<Object> allList() throws Exception;
	
}
