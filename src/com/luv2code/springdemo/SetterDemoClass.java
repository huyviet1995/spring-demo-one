package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoClass {
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		MyCricketCoach theCoach = context.getBean("myCricketCoach", MyCricketCoach.class);
		
		// Call methods on the bean
		
		
		// Close the context
		context.close();
	}
}
