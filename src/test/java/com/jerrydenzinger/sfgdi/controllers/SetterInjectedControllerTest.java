package com.jerrydenzinger.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jerrydenzinger.sfgdi.services.SetterGreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new SetterGreetingServiceImpl());
	}

	@Test
	void getGreetingTest() {
		System.out.println(controller.getGreeting());
	}

}
