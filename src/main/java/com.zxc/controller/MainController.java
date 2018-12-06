package com.zxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxc.service.PersonService;
import com.zxc.service.TestService;

/**
 * @program: macblog
 * @description:主控制器
 * @author: Xiangchun Zeng
 * @create: 2018-09-14 16:56
 **/
@Controller
public class MainController {

	@Autowired
	private TestService testService;

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test(){
		return "test"; //实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
	}

	@RequestMapping(value = "springtest", method = RequestMethod.GET)
	public String springTest(){
		return testService.test();
	}

	@RequestMapping(value = "savePerson", method = RequestMethod.GET)
	@ResponseBody
	public String savePerson(){
		System.out.println(personService.savePerson());
		return "success!";
	}

	@RequestMapping(value = "getPerson", method = RequestMethod.GET)
	@ResponseBody
	public String getPerson(){
		System.out.println(personService.getPersonById(new Long(1)));
		return "success!";
	}
}
