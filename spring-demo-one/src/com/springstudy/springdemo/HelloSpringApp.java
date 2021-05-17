package com.springstudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// spring configuration file �ε�
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// ������ �����̳ʿ��� �� ã��
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theNewCoach = context.getBean("myNewCoach", Coach.class);
		
		// �� �ִ� method ȣ��
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theNewCoach.getDailyWorkout());
		
		
		// close the context
		context.close();
	}
}
