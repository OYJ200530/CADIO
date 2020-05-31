package com.cadio.member.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cadio.common.namespace.RepositoryNS;
import com.cadio.common.repositroy.Repositorys;

@Repository(value = RepositoryNS.MEMBER)
public class MemberRepository extends Repositorys{
	
	@Override 
	public List<Object> searchList(Object obj) throws Exception {
		setNameSpace("searchList");
		return super.searchList(obj);
	}

	@Override
	public Integer create(Object dto) throws Exception {
		setNameSpace("create");
		return super.create(dto);
	}

	@Override
	public Object read(Object dto) throws Exception {
		setNameSpace("read");
		return super.read(dto);
	}

	@Override
	public Integer update(Object dto) throws Exception {
		setNameSpace("update");
		return super.update(dto);
	}

	@Override
	public Integer delete(Object dto) throws Exception {
		setNameSpace("delete");
		return super.delete(dto);
	}

	@Override
	public List<Object> list() throws Exception {
		setNameSpace("list");
		return super.list();
	}

	@Override
	protected void setNameSpace(String queryId) {
		StringBuffer ns = new StringBuffer("member.");
		super.ns = ns.append(queryId).toString();
	}  

}
