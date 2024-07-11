package com.myapp.oops.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.myapp.oops.Product;

public class TestReadCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path= Path.of("products.csv");
		
		List<Product> products = new ArrayList<>();
		List<Product> filteredProducts = new ArrayList<>();
		
		try(BufferedReader reader = Files.newBufferedReader(path)) {
		String line=  reader.readLine();
		
		
		while(line!=null) {
			
			if(!line.startsWith("#")) {
				String elements[] = line.split(",");
				String productName = elements[0];
				Double  price = Double.parseDouble(elements[1]);
				Double  rating = Double.parseDouble(elements[2]);
				Product product = new Product(productName, price,rating);
				products.add(product);
				
			}
			line = reader.readLine();
		}
			
		}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(products);
		
		for(Product product: products) {
			if(product.getPrice()>=75000.0) {
				filteredProducts.add(product);
			}
		}
		
		System.out.println(filteredProducts);
	}

}
