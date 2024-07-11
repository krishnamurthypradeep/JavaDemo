package com.myapp.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExceptionHandlingAutoCleanup {

	public static void main(String[] args) {
		
//		try {
//		
//		}catch(Exception e) {}
		
		// try(){}catch(

		// BufferedReader reader = null;
		
		// try with resource where resources are autoclosed
		try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));) {

		}

		catch (FileNotFoundException | ArithmeticException  e) {
			e.printStackTrace();
		} 
		//catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			
//			
//			try {
//				reader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("Inside Finally");
//			
//		}

	}

	// V min()
	// V max()
	
	// int intArray [] ={45,55,67,78}
	// double doubleArray = {45.5,55.5,78.5}
	// float floatArray = {23.4f,34.5f,56.5f}
	// char charArray[] = {'a','d','f','g}
	
	// int min(int []array){}
	// int max(int []array){}
	
	// double min(double []array){}
	// double max(double []array){}
	
	// float min(float []array){}
	// float max(float []array){}
	
	// 
}
