package com.myapp.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
//	Student save(Student student);
//	
//	List<Student> findAll();
//	
//	List<StudentReport> findAllReports();
//	
	List<Student> findByBranchAndSemester(String branch,String semester);

}

// @SpringBootApplication
//@EnableAutoConfiguration