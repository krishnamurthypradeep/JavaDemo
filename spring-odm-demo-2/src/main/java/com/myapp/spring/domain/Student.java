package com.myapp.spring.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// This is a persistent class


@Document(collection = "students")
public class Student {
	
	public static final String STUDENT_REPORT = "studentReport";
	
	public static final String STUDENT_REPORT_JPQL = 
			 "Select new com.myapp.spring.domain.StudentReport (s.name,s.branch,a.city) "
			+ "from Student s, Address a where s.id = a.student.id";
	
	
	@Id
	private Integer id;
	
	
	private String name;
	
	
	private String branch;
	
	
	private String semester;
	

	private List<Address> address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student( String name, String branch, String semester, List<Address> address) {
	
		this.name = name;
		this.branch = branch;
		this.semester = semester;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", semester=" + semester + "]";
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	

}

// Driver TYPE
// Load The Driver
// Register Driver with Driver Manager
// Executing SQL Queries
// Process The Results
// Close the connection

// Oracle
// MySQL
// PostgreSQL
// SQL Server
// DB2
// HANA DB
// MARIADB

// EntityManagerFactory
// EntityManager (persist, updating , queries)
// Transaction

// Four Join Types
// OneToOne
// OneToMany
// ManyToOne
// ManyToMany




