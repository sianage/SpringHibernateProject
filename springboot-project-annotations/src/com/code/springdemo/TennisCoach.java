package com.code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*spring will automatically register this bean
 * with the spring container using the bean id
 * thatSillyCoach so at a later time we can retrieve
 * that bean from the container using that bean id*/

//we removed the @Component("thatSillyCoach") annotation so it uses the default
@Component
public class TennisCoach implements Coach {
	//Field injection (Step 1)
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define default constructor (Step 1)
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("inside doMyStartupStuff");
	}
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("inside doMyStartupStuff");
	}
	
	//define a new name for setter method & configure with @Autowired(Step 2)
	/*
	@Autowired
	public void doSomeStuff(FortuneService theFortuneService) {
		System.out.println(">> inside doSomeStuff");
		fortuneService = theFortuneService;
	}
	
	//constructor
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice hitting stuff with tennis racket";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
