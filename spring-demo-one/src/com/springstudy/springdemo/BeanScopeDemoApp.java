package com.springstudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// spring container에서 빈 찾기
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// 둘이 같은지 비교, scope default = singleton 따라서 prototype이면 다름
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nIs same? : " + result);
		System.out.println("\nMemory location for theCoach : " + theCoach);
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach);
		// 자원반납
		context.close();
	}

}
