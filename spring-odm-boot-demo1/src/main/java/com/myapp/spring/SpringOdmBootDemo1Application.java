package com.myapp.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.myapp.spring.domain.Student;
import com.myapp.spring.repository.StudentRepository;

@SpringBootApplication

// EnableAutoConfiguration + ComponentScan + SpringBootConfiguration
public class SpringOdmBootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOdmBootDemo1Application.class, args);
	}
	
	
	@Bean
	CommandLineRunner runner(StudentRepository repository,Student student) {
		return args ->{
			
			repository.save(student);
			
			//repository.findAll().forEach(System.out::println);
			
		};
	}

}
