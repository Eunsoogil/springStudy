package com.springStudy.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UFCCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "use kick";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
