package com.spring.code.service;


//@Service
public class HelloWorldService {
	
	public HelloWorldService(){
		
	}
	public String convertToUpperCase(String name){
		System.out.println("Converting the name string to UPPERCASE");
		return name.toUpperCase();
	}
	public String convertToLowerCase(String firstName) {
		System.out.println("Converting the name string to LOWERCASE");
		return firstName.toLowerCase();
	}

}
