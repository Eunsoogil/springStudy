package com.springstudy.springdemo;

public class HappyFourtunService implements FortuneService {

	private String[] randomFortune =
		{"Today is your lucky day",
	 	"Today is your normal day",
	 	"Today is your bad day"};
	
	@Override
	public String getFortune() {
		return randomFortune[(int)(Math.random() * 3)];
	}

}
