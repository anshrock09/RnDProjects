package com.spring.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.code.configuration.HelloWorldBeanConfig;
import com.spring.code.service.HelloWorldService;

@Controller
public class HelloWorldController {

	
	@Autowired
	public HelloWorldBeanConfig helloWorldBeanConfig;
	
	@Autowired
	public HelloWorldService helloWorldServic;
	
	/*public void setHelloWorldService(HelloWorldService helloWorldService){
		this.helloWorldService = helloWorldService;
	}*/
	
	@RequestMapping(value="/hello/{firstName}", method=RequestMethod.GET)
	public String printHelloMessage(ModelMap map, @PathVariable("firstName") String name, @RequestParam("lastName") String lastName){
		
		
		map.addAttribute("message","This is the message from HelloWorldController.<br/>The string parameter in UPPERCASE is "+helloWorldServic.convertToUpperCase(name)+""
				+ "<br/>The request parameter in LOWERCASE is "+helloWorldBeanConfig.getMessageFromHelloWorldService(lastName));
		return "hello";
	}
}
