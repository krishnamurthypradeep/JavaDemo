package com.myapp.spring.repository;

import java.util.List;

import com.myapp.spring.domain.Student;
import com.myapp.spring.domain.StudentReport;

public interface StudentRepository {
	
	
	Student save(Student student);
	
	List<Student> findAll();
	
	//List<StudentReport> findAllReports();
	
	List<Student> findStudentsByBranchAndSemester(String branch,String semester);
	
	void delete(Student student);

}
