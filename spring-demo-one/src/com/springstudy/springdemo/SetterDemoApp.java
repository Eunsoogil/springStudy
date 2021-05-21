package com.springstudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// spring configuration file loading
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// spring container�� ���� bean ã��
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// bean���� methods
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// ���ڿ� injection Ȯ��
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmailAddress());
		
		// �ڿ� �ݳ�
		context.close();
	}

}
