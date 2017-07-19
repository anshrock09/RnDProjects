package com.spring.code.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public String convertToUpperCase(String name){
		return name.toUpperCase();
	}

}
