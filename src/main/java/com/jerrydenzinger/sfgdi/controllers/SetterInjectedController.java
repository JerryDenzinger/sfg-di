package com.jerrydenzinger.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jerrydenzinger.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {
	@Qualifier("setterGreetingServiceImpl")
	@Autowired
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting() + " SetterInjectedController";
	}

}
