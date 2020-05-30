package com.cadio.member.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cadio.common.namespace.RepositoryNS;
import com.cadio.common.namespace.ServiceNS;
import com.cadio.member.repository.MemberRepository;

@Service(value = ServiceNS.MEMBER)
public class MemberService {
	@Resource(name = RepositoryNS.MEMBER)
	private MemberRepository repository;
	
	
	
}
