package com.myapp.spring.domain;

public class Address {
	
	private Integer id;
	

	private String street;
	

	private String city;
	

	private Long zipCode;
	
	private Student student;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Address(String street, String city, Long zipCode) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Long getZipCode() {
		return zipCode;
	}


	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}
	
	




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
	

}
