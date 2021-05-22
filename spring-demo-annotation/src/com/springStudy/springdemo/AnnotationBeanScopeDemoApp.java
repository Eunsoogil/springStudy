package com.springStudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Same Object? : " + result);
		
		System.out.println("\nMemory location theCoach : " + theCoach);
		System.out.println("\nMemory location alphaCoach : " + alphaCoach);
		
		// close
		context.close();
	}

}
