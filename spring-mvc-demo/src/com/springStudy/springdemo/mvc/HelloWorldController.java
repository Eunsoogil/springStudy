package com.springStudy.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// form에 있는 request parameter 읽기
		String theName = request.getParameter("studentName");
		
		// 대문자로 변환
		theName = theName.toUpperCase();
		
		// 메시지 생성
		String result = "Yo! " + theName;
		
		// model에 담기
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			// request를 직접 지정하여 사용 가능
			@RequestParam("studentName") String theName, 
			Model model) {
		
		// 대문자로 변환
		theName = theName.toUpperCase();
		
		// 메시지 생성
		String result = "Hey my friend! " + theName;
		
		// model에 담기
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
