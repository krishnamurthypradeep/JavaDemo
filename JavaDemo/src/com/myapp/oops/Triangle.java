package com.myapp.oops;

// Encapsulation
public class Triangle extends Shape{
	
	
	public Triangle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	
	// Overriding
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return .5*getWidth()*getHeight();
	}
}
