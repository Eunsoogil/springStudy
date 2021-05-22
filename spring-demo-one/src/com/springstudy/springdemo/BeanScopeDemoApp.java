package com.springstudy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// spring container���� �� ã��
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// ���� ������ ��, scope default = singleton ���� prototype�̸� �ٸ�
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nIs same? : " + result);
		System.out.println("\nMemory location for theCoach : " + theCoach);
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach);
		// �ڿ��ݳ�
		context.close();
	}

}
