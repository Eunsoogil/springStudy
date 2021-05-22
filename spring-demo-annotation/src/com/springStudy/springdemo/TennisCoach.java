package com.springStudy.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// XML�� ���� ���� ����ϴ� ���, container�� ����ش�
// default ID : tennisCoach(�� �빮�ڸ� �ҹ���)
//@Component("thatSillyCoach")
@Component

// Scope : xml ������ ���������� 5���� ����, default singleton pattern
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	// field injection, �ڹ� reflection ��� �̿�
	// private�ε��� container�� �����ϰ� �Ǹ� �����ڳ� �޼ҵ� ���� ��� ��� ����
	// qualifier : autowired�� ���� Ŭ������ ��ӹ޾Ҵٸ� ��� ����, �� �ҹ��ڷ�
	// Ŭ���� �̸� ���� ���
	@Autowired
//	@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("tennis coach default constructor");
	}
	
	// postConstruct, preDestroy annotation�� ��� java 9 �̻��̸� �ȵ�
	// ��Ŭ������ import�� ���� ����Ϸ��� ������ jar �ٿ�ε� �ʿ�
	@PostConstruct
	public void checkInit() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void checkDestroy() {
		System.out.println("destroy");
	}
	
	/*
	// autowired ��ø� ���� �پ��� �޼ҵ� ȣ�� ����
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("tennis coach setter method");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
