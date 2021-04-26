package com.jerrydenzinger.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "Dog", "default" })
@Service("bestPetService")
public class BestPetDogService implements BestPetService {

	@Override
	public String whichPetIsTheBest() {
		return "Dogs of course";
	}

}
