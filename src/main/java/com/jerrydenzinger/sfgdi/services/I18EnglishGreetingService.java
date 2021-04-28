package com.jerrydenzinger.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.jerrydenzinger.sfgdi.repositories.EnglishGreetingRepository;

@Profile("EN")
@Service("i18nService")
public class I18EnglishGreetingService implements GreetingService {

	private final EnglishGreetingRepository englishGreetingRepository;

	public I18EnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		this.englishGreetingRepository = englishGreetingRepository;
	}

	@Override
	public String sayGreeting() {
		return englishGreetingRepository.getGreeting();
	}

}
