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
		
		// autowired�� �̿��� dependency injection
		// ��ø� ���� � method�� ������� �� �� ����
		System.out.println(theCoach.getDailyFortune());
		
		// practice
		// �տ� �ҹ��ڷ� �ϸ� ��ã��
		Coach ufcCoach = context.getBean("UFCCoach", Coach.class);
		
		System.out.println(ufcCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
