package com.springStudy.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//xml config file ¾øÀÌ
@Configuration
//@ComponentScan("com.springStudy.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	// inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
