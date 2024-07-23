package com.myapp.spring.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.myapp.spring.domain.Address;
import com.myapp.spring.domain.Student;

@Configuration
@ComponentScan(basePackages = "com.myapp.spring")
public class AppConfig {
	
	@Bean
	Student student(List<Address> address) {
		
		return new Student("Student1","CS", "7", address);
	}
	
	@Bean
	Address address() {
		return new Address("Bandra","mumbai", 760001L);
	}
	
	@Bean
	Address address1() {
		return new Address("Juhu","mumbai",760065L);
	}
	
	
}

// Spring Core => Beans are manually configured

// Spring Boot = Spring Core + AutoConfiguration

