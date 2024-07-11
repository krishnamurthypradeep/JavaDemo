package com.myapp.oops.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.myapp.oops.Product;

public class TestObjectDeserialization {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("tmp.obj"));
		try (ObjectInputStream ois = new ObjectInputStream
				(Files.newInputStream(Paths.get("tmp.obj"),StandardOpenOption.READ))){
			
			Product products []=(Product[])ois.readObject();
			
			//System.out.println(products);
			
			for(Product p:products) {
				System.out.println(p);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Java 7 
		// Path or File
		// Used to access file or Directory
		// its elements
		// its symbolic link
		
		// 2 Patterns are available to create a path
		// a. From Paths Factory Class
		
		// Java 11
		// Path.of()
		

	}

}
