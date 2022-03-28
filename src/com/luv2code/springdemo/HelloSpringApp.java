package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vietdh
 *
 */
public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		System.out.println(theCoach.getDailyFortune());

		context.close();
	}

}
