package com.jerrydenzinger.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jerrydenzinger.sfgdi.controllers.ConstructorInjectedControler;
import com.jerrydenzinger.sfgdi.controllers.I18nController;
import com.jerrydenzinger.sfgdi.controllers.MyController;
import com.jerrydenzinger.sfgdi.controllers.PetController;
import com.jerrydenzinger.sfgdi.controllers.PropertyInjectedController;
import com.jerrydenzinger.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println("--- The Best Pet is ----");
		System.out.println(petController.whichPetIsTheBest());
		
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("---------Profile controlled");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("---------Primary");
		System.out.println(myController.sayHello());

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
