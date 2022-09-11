package com.code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create array of strings
	private String[] data = {
			"message1",
			"message2",
			"message3"
	};
	
	//random # generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick random fortune from array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
