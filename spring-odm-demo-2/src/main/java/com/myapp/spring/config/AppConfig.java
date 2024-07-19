package com.myapp.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@ComponentScan(basePackages = "com.myapp.spring")
public class AppConfig {
	
	@Bean
	MongoTemplate mongoTemplate() {
		
		//return new MongoTemplate(null, null)
		
		return null;
	}

}
