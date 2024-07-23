package com.myapp.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myapp.spring.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
	
	
//	Student save(Student student);
//	
//	List<Student> findAll();
//	
//	//List<StudentReport> findAllReports();
//	
//	List<Student> findStudentsByBranchAndSemester(String branch,String semester);
//	
//	void delete(Student student);

}
