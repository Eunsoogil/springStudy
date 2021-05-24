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
		
		// form�� �ִ� request parameter �б�
		String theName = request.getParameter("studentName");
		
		// �빮�ڷ� ��ȯ
		theName = theName.toUpperCase();
		
		// �޽��� ����
		String result = "Yo! " + theName;
		
		// model�� ���
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			// request�� ���� �����Ͽ� ��� ����
			@RequestParam("studentName") String theName, 
			Model model) {
		
		// �빮�ڷ� ��ȯ
		theName = theName.toUpperCase();
		
		// �޽��� ����
		String result = "Hey my friend! " + theName;
		
		// model�� ���
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
