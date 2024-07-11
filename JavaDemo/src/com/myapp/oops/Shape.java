package com.myapp.oops;


 public abstract class Shape extends Object{
	 
	 private double width,height;
	 
	
	 
	 //Parameterized  Constructor
	 public Shape(double width,double height) {
		 this.width = width;
		 this.height = height;
	 }
	 
	 public abstract double calculateArea();
	 
	 public double getWidth() {
		return width;
	}
	 public void setWidth(double width) {
		this.width = width;
	}
	 
	 public double getHeight() {
		return height;
	}
	 
	 public void setHeight(double height) {
		this.height = height;
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
	 

}
