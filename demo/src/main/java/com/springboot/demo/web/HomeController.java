package com.springboot.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.demo.domain.User;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		// application.properties에서 thymeleaf cache를 false로, 개발환경이므로 데이터 저장 방
		model.addAttribute("formData", new User());
		return "pages/index";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	// model을 받아서 쓰지 않아도 잘 동작함
	// RedirectAttributes 객체 : redirect를 위해 추가
	public String processFormData(User user, RedirectAttributes attr) {
		attr.addFlashAttribute("user", user);
		return "redirect:/display";
	}
	
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String displayFormData(User user) {
		return "pages/result";
	}
}
