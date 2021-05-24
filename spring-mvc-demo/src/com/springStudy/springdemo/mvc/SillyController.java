package com.springStudy.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	// controller 충돌 재현, HelloWolrdController와 같은 requestMapping 주소
	// HelloWolrdController 최상단 requestMapping을 바꿔 해결
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
