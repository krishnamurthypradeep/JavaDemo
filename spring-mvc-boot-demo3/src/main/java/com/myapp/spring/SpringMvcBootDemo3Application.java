package com.myapp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcBootDemo3Application {

	public static void main(String[] args) {
		
//		switch (key) {
//		case value: {
//			
//			yield type;
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + key);
//		}
		SpringApplication.run(SpringMvcBootDemo3Application.class, args);
	}

}

// Front Controller - DispatcherServlet
// HandlerMapping -> Delegate The Request To The Controllers
// Controllers -> Java Class where the request processing logic and the response generation
// ViewResolvers -> Resolve The view and bind the model to view (JSP, Thymeleaf)