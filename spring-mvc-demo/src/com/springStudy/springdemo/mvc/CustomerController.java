package com.springStudy.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// binding되기 전에 시행, 단순한 trim 동작을 한다
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			// valid로 선언한 객체를 생성하면 객체 내의 hibernate validator가 확인
			@Valid @ModelAttribute("customer") Customer theCustomer,
			
			// 결과 return
			BindingResult theBindingResult) {
		
//		System.out.println("Last name : |" + theCustomer.getLastName() + "|");
		
//		System.out.println("Binding result : " + theBindingResult);
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		return "customer-confirmation";
	}
}







