package com.cadio.member.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cadio.common.namespace.ControllerNS;
import com.cadio.common.namespace.ServiceNS;
import com.cadio.common.service.Services;

@Controller
@RequestMapping(path = ControllerNS.MEMBER)
public class MemberController {
	@Resource(name = ServiceNS.MEMBER)
	private Services service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(ModelAndView mv) throws Exception {
		mv.setViewName("/member/list");
		System.out.println(service); 
		mv.addObject("list", service.allList());
		service.register(new String());
 		return mv; 
	}
}
