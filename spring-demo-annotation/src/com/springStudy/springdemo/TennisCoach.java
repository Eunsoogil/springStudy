package com.springStudy.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// XML에 기재 없이 사용하는 방법, container에 담아준다
// default ID : tennisCoach(앞 대문자를 소문자)
//@Component("thatSillyCoach")
@Component

// Scope : xml 설정과 마찬가지로 5가지 존재, default singleton pattern
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	// field injection, 자바 reflection 기술 이용
	// private인데도 container에 존재하게 되며 생성자나 메소드 등이 없어도 사용 가능
	// qualifier : autowired시 다중 클래스가 상속받았다면 명시 가능, 앞 소문자로
	// 클래스 이름 직접 명시
	@Autowired
//	@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("tennis coach default constructor");
	}
	
	// postConstruct, preDestroy annotation의 경우 java 9 이상이면 안됨
	// 이클립스가 import를 못함 사용하려면 별도의 jar 다운로드 필요
	@PostConstruct
	public void checkInit() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void checkDestroy() {
		System.out.println("destroy");
	}
	
	/*
	// autowired 명시를 통해 다양한 메소드 호출 가능
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
