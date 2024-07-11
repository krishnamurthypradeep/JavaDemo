package com.myapp.functional;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.myapp.oops.Product;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<MyCity> set = new HashSet<>();
		set.add(new MyCity("Bengaluru","Karnataka",35000000.0));
		set.add(new MyCity("Bengaluru","Karnataka",35000000.0));
		set.add(new MyCity("Mangaluru","Karnataka",25000000.0));
		
		System.out.println("Size "+set.size());
		
		Set<Product> products = new HashSet<>();
		
		products.add(new Product("Iphone15",75456.5));
		products.add(new Product("Iphone15",75456.5));
		products.add(new Product("Oneplus11R",45456.5));
		
		System.out.println("Size of products "+products.size());
		
		// Streams
		products.stream().filter(p -> p.getPrice() >=75000.0)
		.collect(Collectors.toSet());

		// products.stream()
		
		// filter(p -> p.getPrice() >=75000.0) intermediate operations
		// .collect(Collectors.toSet());  terminal operation

		
	}

}

// servlets & jsp
// jakarta ee

// get
// post
// put
// delete
// patch

// 200
// 404
// 500
// 303
// 101

// 100
// 200
// 300
// 400
// 500

