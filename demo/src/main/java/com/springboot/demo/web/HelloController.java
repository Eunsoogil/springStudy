package com.springboot.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/greeting")
public class HelloController {

	@RequestMapping(value="/basic", method=RequestMethod.GET)
	public String sayHello() {
//		return "hello";
		// pom.xml 우클릭 -> spring -> add starters -> devtools 추가, 변화가 생기면 알아서 refresh
		return "<h1>hello</h1>";
	}
	
}
