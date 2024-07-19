package com.myapp.spring.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myapp.spring.domain.Address;
import com.myapp.spring.domain.Student;

@Configuration
public class AppConfig {
	
	@Bean
	Student student(List<Address> address) {
		
		return new Student(1,"Name1","CS", "7", address);
	}
	
	@Bean
	Address address() {
		return new Address("MGRoad","bengaluru", 560001L);
	}
	
	@Bean
	Address address1() {
		return new Address("Kormangala","bengaluru", 560065L);
	}
	
	@Bean
	Address address2() {
		return new Address("Hebbal","mysuru", 570065L);
	}
	
	

}

// ORM 
// JPA
// Hibernate


