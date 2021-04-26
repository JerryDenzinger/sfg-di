package com.jerrydenzinger.sfgdi.controllers;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.jerrydenzinger.sfgdi.services.PropertyGreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new PropertyGreetingServiceImpl();
	}

	@Test
	void GetGreetingTest() {
		System.out.println(controller.getGreeting());
	}

}
