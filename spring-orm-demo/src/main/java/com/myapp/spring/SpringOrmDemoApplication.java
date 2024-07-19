package com.myapp.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.config.AppConfig;
import com.myapp.spring.domain.Student;
import com.myapp.spring.repository.StudentRepository;

//@SpringBootApplication
public class SpringOrmDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringOrmDemoApplication.class, args);
		
		AbstractApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
	
	StudentRepository repository =	 iocContainer.getBean(StudentRepository.class);
	
	Student student =	 iocContainer.getBean(Student.class);
	//repository.save(student);
	
	
	
//	repository.findAll().forEach(s ->{
//		System.out.println( s.getAddress());
//	});
//	
	
	//repository.findAllReports().forEach(System.out::println);
	
	repository.findStudentsByBranchAndSemester("CS", "7").forEach(System.out::println);
	
	iocContainer.close();
	}

}
