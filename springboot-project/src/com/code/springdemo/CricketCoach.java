package com.code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for emailAddress & team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("cricket coach - setEmailAddress");
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
		System.out.println("cricket coach - setTeam");
	}


	//create no arg constructor
	public CricketCoach() {
		System.out.println("no-arg constructor for cricket coach");
	}
	
	
	//setter to be called during dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter for cricket coach");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {		
		return "Practice cricket stuff";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
