package com.cadio.member.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cadio.common.namespace.ControllerNS;
import com.cadio.common.namespace.ServiceNS;
import com.cadio.member.service.MemberService;

@Controller
@RequestMapping(path = ControllerNS.MEMBER)
public class MemberController {
	@Resource(name = ServiceNS.MEMBER)
	private MemberService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(ModelAndView mv) {
		mv.setViewName("/member/list");
		System.out.println(service); 
		return mv; 
	}
}
