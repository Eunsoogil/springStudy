package com.springStudy.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
	// ConstraintValidator는 validation 관련 자바 패키지 객체
	implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	// 이클립스 버그로 자동생성이 안될 수 있음
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode,
			ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = theCode.startsWith(coursePrefix);
		return result;
	}

}
