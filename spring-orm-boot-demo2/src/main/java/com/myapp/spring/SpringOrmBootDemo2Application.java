package com.myapp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myapp.spring.domain.Student;
import com.myapp.spring.repository.StudentRepository;

@SpringBootApplication
public class SpringOrmBootDemo2Application implements CommandLineRunner{
	
	
	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private Student student;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmBootDemo2Application.class, args);
	}
	// Spring IOC Container

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//repository.findAll().forEach(System.out::println);
		
		repository.findByBranchAndSemester("CS", "5").forEach(System.out::println);

	}
	
	
	
//	@Bean
//	CommandLineRunner runner(StudentRepository repository,Student student) {
//		return args ->{
//			
//			//repository.save(student);
//			
//			repository.findAll().forEach(System.out::println);
//			
//		};
//	}

}
