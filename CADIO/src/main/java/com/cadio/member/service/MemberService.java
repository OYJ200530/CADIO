package com.cadio.member.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.cadio.common.namespace.RepositoryNS;
import com.cadio.common.namespace.ServiceNS;
import com.cadio.common.repositroy.Repositorys;
import com.cadio.common.service.Services;

@Service(value = ServiceNS.MEMBER)
public class MemberService extends Services {
	@Resource(name = RepositoryNS.MEMBER)
	private Repositorys repository;

	@Override
	public List<Object> searchingList(Object obj) throws Exception {
		super.setRepository(repository);
		return super.searchingList(obj);
	}

	@Override
	public Integer register(Object dto) throws Exception {
		super.setRepository(repository);
		return super.register(dto);
	}

	@Override
	public Object getOne(Object dto) throws Exception {
		super.setRepository(repository);
		return super.getOne(dto);
	}

	@Override
	public Integer modify(Object dto) throws Exception {
		super.setRepository(repository);
		return super.modify(dto);
	}

	@Override
	public Integer destroy(Object dto) throws Exception {
		super.setRepository(repository);
		return super.destroy(dto);
	}

	@Override
	public List<Object> allList() throws Exception {
		super.setRepository(repository);
		return super.allList(); 
	}
	
	
}
