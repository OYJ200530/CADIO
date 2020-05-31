package com.cadio.common.service;

import java.util.List;

import com.cadio.common.repositroy.Repositorys;

public abstract class Services implements CRUDService,SearchService{
	
	private Repositorys repository;
	
	@Override
	public List<Object> searchingList(Object obj) throws Exception {
		return repository.searchList(obj);
	}

	@Override
	public Integer register(Object dto) throws Exception {
		return repository.create(dto);
	}

	@Override
	public Object getOne(Object dto) throws Exception {
		return repository.read(dto);
	}

	@Override
	public Integer modify(Object dto) throws Exception {
		return repository.update(dto);
	}

	@Override
	public Integer destroy(Object dto) throws Exception {
		return repository.delete(dto);
	}

	@Override
	public List<Object> allList() throws Exception {
		return repository.list();
	}


	protected void setRepository(Repositorys repository) {
		this.repository = repository;
	} 
	
}
