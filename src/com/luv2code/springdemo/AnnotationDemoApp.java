package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		// read string config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the container
		context.close();
	}
}
