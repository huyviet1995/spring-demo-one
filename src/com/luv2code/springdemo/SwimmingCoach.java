package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "I should get some exercises daily just by go swimming";
	}

}
