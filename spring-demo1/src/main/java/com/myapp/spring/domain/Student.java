package com.myapp.spring.domain;

import java.util.List;

public class Student {
	
	
	private Integer id;
	private String name;
	private String branch;
	private String semester;
	private List<Address> address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String branch, String semester, List<Address> address) {
		this.id = id;
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
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", semester=" + semester + ", address="
				+ address + "]";
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	

}

// Oracle
// MySQL
// PostgreSQL
// SQL Server
// DB2
// HANA DB
// MARIADB
