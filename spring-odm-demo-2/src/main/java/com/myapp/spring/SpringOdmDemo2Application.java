package com.myapp.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.config.AppConfig;
import com.myapp.spring.domain.Student;
import com.myapp.spring.repository.StudentRepository;

//@SpringBootApplication
public class SpringOdmDemo2Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringOdmDemo2Application.class, args);
		
		
		AbstractApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
	
	StudentRepository repository =	 iocContainer.getBean(StudentRepository.class);
	
	Student student =	 iocContainer.getBean(Student.class);
	//System.out.println(repository.save(student));
	
	//repository.findAll().forEach(System.out::println);
	//repository.findStudentsByBranchAndSemester("CS", "7").forEach(System.out::println);
	student.setId("669e625eb2e9016002a443aa");
	
	repository.delete(student);
	
	iocContainer.close();
	
	}

}
