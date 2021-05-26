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
	
	// binding�Ǳ� ���� ����, �ܼ��� trim ������ �Ѵ�
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
			// valid�� ������ ��ü�� �����ϸ� ��ü ���� hibernate validator�� Ȯ��
			@Valid @ModelAttribute("customer") Customer theCustomer,
			
			// ��� return
			BindingResult theBindingResult) {
		
//		System.out.println("Last name : |" + theCustomer.getLastName() + "|");
		
//		System.out.println("Binding result : " + theBindingResult);
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		return "customer-confirmation";
	}
}







