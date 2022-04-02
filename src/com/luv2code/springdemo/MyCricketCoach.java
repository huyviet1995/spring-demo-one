package com.luv2code.springdemo;

public class MyCricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// Create a no-arg constructor
	public MyCricketCoach() {
		System.out.println("Cricket Coach inside the no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
