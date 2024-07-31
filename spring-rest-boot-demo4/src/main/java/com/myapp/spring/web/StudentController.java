package com.myapp.spring.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.domain.Student;
import com.myapp.spring.repository.StudentRepository;
import com.myapp.spring.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	
	private StudentService studentService;
	private StudentRepository repository;

	
	
	
	
	public StudentController(StudentService studentService, StudentRepository repository) {
		this.studentService = studentService;
		this.repository = repository;
	}





	// http://localhost:8080/api/v1/students
	
	// http://localhost:8080/api/v1/students/branch
	
	// http methods as verbs
	
	// GET = READ
	// POST = CREATE OR SEARCH
	 // PUT = UPDATE
	// DELETE = DELETE
	// PATCH = PARTIAL UPDATE
	
	// Rest Operates using 3 key components
	// Resources and URI
	// HTTP Methods
	// HATEOAS
	
	// HTTP STATUS CODES
	// 100-199
	// 200-299
	// 300-399
	// 400-499
	// 500-599
	// 200 OK
	// 201
	// 202
	// 204
	// 304
	// 400
	// 401
	// 403
	// 404
	// 500
	// 503
	
	// JSON OR XML
	
	
//	@GetMapping
//	public List<Student> showStudentsList() {
//		return studentService.findAll();
//		
//	}
	
	@GetMapping
	public List<Student> showStudentsList() {
		return repository.findAll();
		
	}
	
	@GetMapping("/find/{branch}/{semester}")
	public List<Student> showStudentsByBranchAndSemester(
			@PathVariable("branch")String  branch,@PathVariable("semester") String semester) {
		return repository.findByBranchAndSemester(branch, semester);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> showStudentById(@PathVariable("id") Integer id) {
		 try {
			return new ResponseEntity<>(repository.findById(id).get(),HttpStatus.OK);
		} catch (Exception e) {
				return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable("id") Integer id, @RequestBody Student student) {
		
		Student existingstudent = repository.findById(id).get();
		BeanUtils.copyProperties(student, existingstudent);
		return repository.save(student);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") Integer id) {
		
		repository.deleteById(id);
		
		return "Student With id "+ id + "   deleted";
		
		
	}
	
	
	
	
	
	
}

// Non Breaking Change

// Adding Review 

// Breaking Changes



// Breaking Change

// REST Web Services

// Building a Version Strategy
// URI
// /api/v1/students

///api/v2/students

// Query

// /api/students?v=1, api/students?v=2

// CUSTOM HTTP HEADER
// X-API-VERSION: 1
//X-API-VERSION: 2
// ACCEPT HEADER
// application/vnd.nttdata.v1+json
// application/vnd.nttdata.v2+json

// features
//    	v1
		// services
		// model
		// repository

//    v2
	// services
	// model
	// repository





// API 
// RPC
// SOAP
// REST


// Spring Cloud

// Service Discovery (Netflix Eureka, Netflix Ribbon)
// API Gateway (Zuul, Cloud gateway)
// Circuit Breaker (Hystrix,Resilience4J)
// Centralized Configuration (ConfigServer)
// Distributed Tracing (Netflix Tracing)
