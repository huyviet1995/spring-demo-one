package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// defind a private field for dependency
	private FortuneService fortuneService;
	
	// Define a constructor for dependencies injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// use my fortune service to get the fortune service
		return "spend 30 minutes on batching practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
