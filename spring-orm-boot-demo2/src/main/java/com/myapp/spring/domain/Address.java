package com.myapp.spring.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_address1")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ADDRESS_ID")
	private Integer id;
	
	@Column(name ="ADDRESS_STREET")
	private String street;
	
	@Column(name ="ADDRESS_CITY")
	private String city;
	
	@Column(name ="ADDRESS_ZIPCODE")
	private Long zipCode;
	
	@ManyToOne
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
