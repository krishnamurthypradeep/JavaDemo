package com.myapp.oops.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.myapp.oops.Product;

public class TestObjectSerialization {
	
	public static void main(String[] args) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream
				(new FileOutputStream("tmp.obj"))){
			
			
			Product products[] = {new Product("Iphone15",85456.5),
					new Product("Oneplus11R",55456.5)};
			
			oos.writeObject(products);
			System.out.println("Objects Serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
