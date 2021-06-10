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
		System.out.println("\n--- The Best Pet is ----");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("\n---------Profile controlled");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("\n---------Primary");
		System.out.println(myController.sayHello());

		System.out.println("\n---------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("\n---------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("\n---------Constructor");

		ConstructorInjectedControler constructorInjectedControler = (ConstructorInjectedControler) ctx
				.getBean("constructorInjectedControler");
		System.out.println(constructorInjectedControler.getGreeting());
		
		System.out.println("\n---------Configuration\n");
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println("User name = " + fakeDataSource.getUsername());
		System.out.println("User password = " + fakeDataSource.getPassword());
		System.out.println("User jdbcurl = " + fakeDataSource.getJdbcurl());
		
		System.out.println("\n--------- Configuration Props Bean\n");
		SfgConfig sfgConfiguration = ctx.getBean(SfgConfig.class);
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcurl());
		
		System.out.println("\n--------- Constructor Binding\n");
		SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
		System.out.println(sfgConstructorConfig.getUsername());
		System.out.println(sfgConstructorConfig.getPassword());
		System.out.println(sfgConstructorConfig.getJdbcurl());
		

	}

}
