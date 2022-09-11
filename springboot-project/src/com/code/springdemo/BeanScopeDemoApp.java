package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if the previous 2 beans are the same bean
		//see if they point to same area of memory
		boolean result = (theCoach == alphaCoach);
		
		//display results
		System.out.println("\nSame object? " + result);
		//print memory location of each
		System.out.println("\nLocation of theCoach " + theCoach);
		System.out.println("\nLocation of theCoach " + alphaCoach);
		
		//close context
		context.close();


	}

}
