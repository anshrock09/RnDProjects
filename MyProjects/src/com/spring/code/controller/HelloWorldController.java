package com.spring.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(path="/hello",method=RequestMethod.GET)
	public String printHelloMessage(ModelMap map){
		map.addAttribute("message","This is coming from HelloWorldController");
		return "hello";
	}
}
