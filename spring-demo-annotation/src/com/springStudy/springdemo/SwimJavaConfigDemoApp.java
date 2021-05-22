package com.springStudy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// xml config 없이
// swimCoach class 사용
public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file(not xml)
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from configuration file
		// interface가 아닌 SwimCoach를 가져옴, 파일에서 값을 가져오므로 직접 설정
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		// autowired를 이용한 dependency injection
		// 명시를 통해 어떤 method든 실행됨을 알 수 있음
		System.out.println(theCoach.getDailyFortune());
		
		// 파일에서 가져온 값 확인
		System.out.println("email:" + theCoach.getEmail());
		System.out.println("team:" + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
