package com.spring.code.configuration;

import com.spring.code.service.HelloWorldService;


public class HelloWorldBeanConfig {
	
	public HelloWorldService helloWorldService;
	
	
	//setter based DI
	/*public void setHelloWorldService(HelloWorldService helloWorldService){
		System.out.println("Setter Injection!!!");
		this.helloWorldService = helloWorldService;
	}*/
	
	//constructor based DI
	public HelloWorldBeanConfig(HelloWorldService helloWorldService){
		System.out.println("Constructor based Dependency Injection!!!");
		this.helloWorldService = helloWorldService;
	}
	
	public String getMessageFromHelloWorldService(String firstName){
		return this.helloWorldService.convertToLowerCase(firstName);
	}
	

}
