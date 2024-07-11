package com.myapp.oops.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile3 {

	public static void main(String[] args) {
		BufferedReader reader =null;
		try {
			 reader=new BufferedReader(new FileReader(args[0]));
		
			
			int data =0;
			
			while((data = reader.read())!= -1) {
				System.out.print((char)data);
			}
			}
		
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		}
		

	}

}
