package com.springStudy.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	// controller �浹 ����, HelloWolrdController�� ���� requestMapping �ּ�
	// HelloWolrdController �ֻ�� requestMapping�� �ٲ� �ذ�
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
