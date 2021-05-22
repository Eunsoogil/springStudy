package com.springStudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from configuration file
//		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		// autowired를 이용한 dependency injection
		// 명시를 통해 어떤 method든 실행됨을 알 수 있음
		System.out.println(theCoach.getDailyFortune());
		
		// practice
		// 앞에 소문자로 하면 못찾음
		Coach ufcCoach = context.getBean("UFCCoach", Coach.class);
		
		System.out.println(ufcCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
