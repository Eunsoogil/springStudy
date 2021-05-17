package com.springstudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// spring configuration file 로딩
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 스프링 컨테이너에서 빈 찾기
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theNewCoach = context.getBean("myNewCoach", Coach.class);
		
		// 빈에 있는 method 호출
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theNewCoach.getDailyWorkout());
		
		
		// close the context
		context.close();
	}
}
