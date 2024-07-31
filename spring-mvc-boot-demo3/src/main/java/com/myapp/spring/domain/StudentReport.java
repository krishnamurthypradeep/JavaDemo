package com.myapp.spring.domain;

public class StudentReport {
	
	private String name;
	private String branch;
	private String city;
	
	
	public StudentReport() {
		
	}


	public StudentReport(String name, String branch, String city) {
		this.name = name;
		this.branch = branch;
		this.city = city;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentReport [name=");
		builder.append(name);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
	
	

}
