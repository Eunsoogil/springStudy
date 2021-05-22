package com.springStudy.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${fortune.1}")
	private String firstFortune;
	
	@Value("${fortune.2}")
	private String secondFortune;
	
	@Value("${fortune.3}")
	private String thirdFortune;
	
	private String[] randomFortune;
		
	
//	private String[] randomFortune =
//		{"Today is your lucky day",
//	 	"Today is your normal day",
//	 	"Today is your bad day"};
	
	public void setFortuneValue() {
		randomFortune = new String[3];
		randomFortune[0] = this.firstFortune;
		randomFortune[1] = this.secondFortune;
		randomFortune[2] = this.thirdFortune;
	}
	
	@Override
	public String getFortune() {
		setFortuneValue();
		return randomFortune[(int)(Math.random() * 3)];
	}

}
