package com.myapp.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExceptionHandling {
	
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		try {
			
		//	BufferedReader reader=new BufferedReader(new FileReader(args[0]));
			reader = new BufferedReader(new FileReader(args[0]));
			
			
//			int a=5;
//			int b=0;
//			int c =a/b;
		}
//		catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		finally {
			
			
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inside Finally");
			
		}
		
	}

}
