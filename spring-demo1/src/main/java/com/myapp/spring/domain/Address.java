package com.myapp.spring.domain;

public class Address {
	private String street;
	private String city;
	private Long zipCode;
	
	
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


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
	

}
