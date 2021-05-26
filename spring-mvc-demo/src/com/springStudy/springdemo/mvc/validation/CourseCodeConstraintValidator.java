package com.springStudy.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
	// ConstraintValidator�� validation ���� �ڹ� ��Ű�� ��ü
	implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	// ��Ŭ���� ���׷� �ڵ������� �ȵ� �� ����
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
