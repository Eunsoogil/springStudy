package com.springStudy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// xml config ����
// swimCoach class ���
public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file(not xml)
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from configuration file
		// interface�� �ƴ� SwimCoach�� ������, ���Ͽ��� ���� �������Ƿ� ���� ����
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		// autowired�� �̿��� dependency injection
		// ��ø� ���� � method�� ������� �� �� ����
		System.out.println(theCoach.getDailyFortune());
		
		// ���Ͽ��� ������ �� Ȯ��
		System.out.println("email:" + theCoach.getEmail());
		System.out.println("team:" + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
