package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		// read string config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the spring container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		Coach theSwimmingCoach = context.getBean("swimmingCoach", SwimmingCoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theSwimmingCoach.getDailyWorkout());
		
		// Call method to get the daily fortune service
		System.out.println(theCoach.getDailyFortune());
		
		// Get fortune service
		System.out.println(theCoach.getFortuneService());
		
		
		// Close the container
		context.close();
	}
}