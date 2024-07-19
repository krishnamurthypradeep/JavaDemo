package com.myapp.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myapp.spring.config.AppConfig;
import com.myapp.spring.domain.Student;

//@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringDemo1Application.class, args);
		
		// Start Of the IOC Container
		AbstractApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student = iocContainer.getBean(Student.class);
		
		System.out.println(student);
		
		iocContainer.close();
	}

}
