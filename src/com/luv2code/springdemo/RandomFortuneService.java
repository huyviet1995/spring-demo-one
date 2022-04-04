package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// Create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep",
			"Dilligence is the mother of good luck",
			"The journey is the reward"
	};

	// Create a random generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		System.out.println("Inside the fortune service");
		
		String theFortune = data[index];

		return theFortune;
	}

}
