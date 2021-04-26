package com.jerrydenzinger.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jerrydenzinger.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedControler {
	private final GreetingService greetingService;

	public ConstructorInjectedControler(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting() + " ConstructorInjectedControler";
	}

}
