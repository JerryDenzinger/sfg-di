package com.jerrydenzinger.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jerrydenzinger.sfgdi.services.BestPetService;

@Controller
public class PetController {

	private final BestPetService bestPetService;

	public PetController(@Qualifier("bestPetService") BestPetService bestPetService) {
		this.bestPetService = bestPetService;
	}

	public String whichPetIsTheBest() {
		return bestPetService.whichPetIsTheBest();
	}

}
