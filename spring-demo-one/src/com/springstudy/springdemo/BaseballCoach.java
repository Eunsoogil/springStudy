package com.springstudy.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "spend 30 mins on batting practice";
	}
}
