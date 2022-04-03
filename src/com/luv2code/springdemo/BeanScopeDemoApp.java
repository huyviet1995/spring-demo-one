package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same bean
		boolean result = theCoach == alphaCoach;
		
		System.out.println(result);
		
		System.out.println("Memory Location for the Coach: " + theCoach);

		System.out.println("Memory Location for the Alpha Coach: " + alphaCoach);
		
		// Close the context
		context.close();
		
	}

}
