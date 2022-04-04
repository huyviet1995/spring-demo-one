package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	// Define the default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: Inside default constructor");
	}

	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		System.out.println("Tennic Coach: Inside the main constructor");
		this.fortuneService = theFortuneService;
	}

	public FortuneService getFortuneService() {
		System.out.println("TennisCoach: Inside get fortune service");
		return fortuneService;
	}

	@Autowired
	public void setFortuneService(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice you backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
