package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		//"myCoach" is a bean id, Coach.class is the bean interface
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		
		context.close();
	}

}
