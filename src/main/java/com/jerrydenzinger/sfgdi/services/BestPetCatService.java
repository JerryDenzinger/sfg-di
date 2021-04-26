package com.jerrydenzinger.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Cat")
@Service("bestPetService")
public class BestPetCatService implements BestPetService {

	@Override
	public String whichPetIsTheBest() {
		return "Dogs of course but Cats are also Cute";
	}

}
