package com.springstudy.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "JUST DO IT: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void initMethod() {
		System.out.println("TrackCoach init");
	}
	
	// add a destroy method
	public void destroyMethod() {
		System.out.println("TrackCoach destroy");
	}
}
