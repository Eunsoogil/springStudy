package com.springstudy.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuenService) {
		System.out.println("CricketCoach setter method - setFortuneService");
		this.fortuneService = fortuenService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "practice for 15mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
