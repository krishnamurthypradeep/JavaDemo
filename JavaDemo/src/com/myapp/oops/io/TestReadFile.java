package com.myapp.oops.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {

	public static void main(String[] args) {
		try (BufferedReader reader=new BufferedReader(new FileReader(args[0]));){
			
			int data =0;
			
			while((data = reader.read())!= -1) {
				System.out.print((char)data);
			}
			}

			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
