package com.jerrydenzinger.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jerrydenzinger.sfgdi.services.ConstructorGreetingServiceImpl;

class ConstructorInjectedControlerTest {

	ConstructorInjectedControler controller;

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedControler(new ConstructorGreetingServiceImpl());
	}

	@Test
	void getGreetingTest() {
		System.out.println(controller.getGreeting());
	}

}
