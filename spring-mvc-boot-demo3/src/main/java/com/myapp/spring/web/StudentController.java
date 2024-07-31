package com.myapp.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.myapp.spring.domain.Student;
import com.myapp.spring.repository.StudentRepository;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	private StudentRepository repository;

	public StudentController(StudentRepository repository) {
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
	
	
	@GetMapping("/index")
	public String showStudentsList(Model model) {
		model.addAttribute("students", repository.findAll());
		return "index";
	}
	
	@GetMapping("/edit/{id}")
	public String displayUpdateForm(@PathVariable("id") String id,Model model) {
		
	Student student =	repository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Student Id :"+id));
		
		model.addAttribute("student", student);
		return "update-student";
	}
	
	@PostMapping("/update/{id}")
	public String updateStudent(@PathVariable("id") String id, @Valid Student student,
			BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			student.setId(id);
			return "update-student";
		}
		repository.save(student);
		return "redirect:/index";
		
	}

}

// REST Web Services

// API 
// RPC
// SOAP
// REST
