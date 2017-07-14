package com.spring.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.code.service.HelloWorldService;

@Controller
public class HelloWorldController {

	@Autowired
	public HelloWorldService helloWorldService;
	
	@RequestMapping(value="/hello/{firstName}", method=RequestMethod.GET)
	public String printHelloMessage(ModelMap map, @PathVariable("firstName") String fName){
		map.addAttribute("message","This is updated from HelloWorldController. The first name is "+helloWorldService.convertToUpperCase(fName));
		return "hello";
	}
}
