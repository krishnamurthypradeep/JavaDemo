package com.myapp.spring.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

// This is a persistent class


@Document(collection = "students")
public class Student {
	
	
	@Id
	private String id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@NotBlank(message = "Branch is mandatory")
	private String branch;
	
	@NotBlank(message = "Semester is mandatory")
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	
	
	

	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", semester=");
		builder.append(semester);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
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




