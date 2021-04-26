package com.jerrydenzinger.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String sayHello() {
		
		System.out.println("Hello World --- sysout from controller!!");
		return "Hello from controller";
		
	}

}
