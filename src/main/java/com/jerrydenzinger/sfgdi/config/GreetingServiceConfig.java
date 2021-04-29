package com.jerrydenzinger.sfgdi.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.jerrydenzinger.sfgdi.datasource.FakeDataSource;
import com.jerrydenzinger.sfgdi.repositories.EnglishGreetingRepository;
import com.jerrydenzinger.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import com.jerrydenzinger.sfgdi.services.ConstructorGreetingServiceImpl;
import com.jerrydenzinger.sfgdi.services.PrimaryGreetingService;
import com.jerrydenzinger.sfgdi.services.PropertyGreetingServiceImpl;
import com.jerrydenzinger.sfgdi.services.SetterGreetingServiceImpl;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
public class GreetingServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(SfgConfig sfgConfiguration) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(sfgConfiguration.getUsername());
		fakeDataSource.setPassword(sfgConfiguration.getPassword());
		fakeDataSource.setJdbcurl(sfgConfiguration.getJdbcurl());
		return fakeDataSource;
	}

	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}

	@Profile({ "dog", "default" })
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}

	@Bean
	@Profile("cat")
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}

	@Bean
	EnglishGreetingRepository englishGreetingRepositor() {
		return new EnglishGreetingRepositoryImpl();
	}

	@Bean
	ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
		return new ConstructorGreetingServiceImpl();
	}

	@Bean
	PropertyGreetingServiceImpl propertyGreetingServiceImpl() {
		return new PropertyGreetingServiceImpl();
	}

	@Bean
	SetterGreetingServiceImpl setterGreetingServiceImpl() {
		return new SetterGreetingServiceImpl();
	}

	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
}
