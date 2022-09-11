package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring congig file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are the same object
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nSame object? " + result);
		
		System.out.println("\nMem location of theCoach: " + theCoach);
		
		System.out.println("\nMem lo cation of alphaCoach: " + alphaCoach);
		
		context.close();

	}

}
