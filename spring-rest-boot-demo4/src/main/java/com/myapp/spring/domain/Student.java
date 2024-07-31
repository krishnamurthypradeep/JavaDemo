package com.myapp.spring.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// This is a persistent class

@Entity
@Table(name="new_students2")
@NamedQueries({
	@NamedQuery(name = Student.STUDENT_REPORT,query = Student.STUDENT_REPORT_JPQL)
})
public class Student {
	
	public static final String STUDENT_REPORT = "studentReport";
	
	public static final String STUDENT_REPORT_JPQL = 
			 "Select new com.myapp.spring.domain.StudentReport (s.name,s.branch,a.city) "
			+ "from Student s, Address a where s.id = a.student.id";
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="STUDENT_ID",nullable = false,unique = true)
	private Integer id;
	
	@Column(name ="STUDENT_NAME",nullable = false,length = 75)
	private String name;
	
	@Column(name ="STUDENT_BRANCH",nullable = false)
	private String branch;
	
	@Column(name ="STUDENT_SEMESTER",nullable = false)
	private String semester;
	
//	@Transient
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
	//@JoinColumn(name = "student_STUDENT_ID ")
	@JsonIgnoreProperties("student")
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
		builder.append("]");
		return builder.toString();
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Student [id=");
//		builder.append(id);
//		builder.append(", name=");
//		builder.append(name);
//		builder.append(", branch=");
//		builder.append(branch);
//		builder.append(", semester=");
//		builder.append(semester);
//		builder.append(", address=");
//		builder.append(address);
//		builder.append("]");
//		return builder.toString();
//	}
	
	
	

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




