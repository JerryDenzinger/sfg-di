package com.jerrydenzinger.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jerrydenzinger.sfgdi.controllers.ConstructorInjectedControler;
import com.jerrydenzinger.sfgdi.controllers.MyController;
import com.jerrydenzinger.sfgdi.controllers.PropertyInjectedController;
import com.jerrydenzinger.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("---------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("---------Constructor");
		
		ConstructorInjectedControler constructorInjectedControler = (ConstructorInjectedControler) ctx
				.getBean("constructorInjectedControler");
		System.out.println(constructorInjectedControler.getGreeting());

	}

}
