package com.luv2code.springdemo;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice you backhand volley";
	}

}
