package com.springstudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// spring configuration file loading
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring container로 부터 bean 찾기
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// bean에서 methods
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// 문자열 injection 확인
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmailAddress());
		
		// 자원 반납
		context.close();
	}

}
