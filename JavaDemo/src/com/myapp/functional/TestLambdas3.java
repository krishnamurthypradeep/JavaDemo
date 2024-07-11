package com.myapp.functional;

import java.util.List;

import com.myapp.oops.Product;

public class TestLambdas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Product p1 = new Product("Iphone15", 75456.5);
		
		Product p2 = new Product("Oneplus11R", 65456.5);
		
		Product p3 = new Product("SamsungFlip", 55456.5);
		
		List<Product> products = List.of(p1,p2,p3);
		
		products.forEach(System.out::println);
		
		products.forEach(product -> System.out.println(product));
		
		for(int i=0;i<products.size();i++) {
			System.out.println(products.get(i));
		}

	}

}
