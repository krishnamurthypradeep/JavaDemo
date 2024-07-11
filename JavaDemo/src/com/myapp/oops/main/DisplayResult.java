package com.myapp.oops.main;
import com.myapp.oops.Rectangle;
import com.myapp.oops.TestAbstraction;
import com.myapp.oops.Triangle;
public class DisplayResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAbstraction.display(new Rectangle(23.4,34.5));
		TestAbstraction.display(new Triangle(23.4,34.5));

	}

}
