package com.myapp.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.myapp.oops.MyComparable;
import com.myapp.oops.Product;

public class MyLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Library
		Supplier<String> supplier  = () -> "Functional";
		
		Supplier<Product> supplier1  = () -> new Product("Iphone15", 85445.5);
		Supplier<Product> supplier2  = () -> new Product("Oneplus11", 45445.5);
		
		
		MyComparable<Product> mycomparable = (product1,product2) -> 
		((Double)product1.getPrice()).compareTo(product2.getPrice());
		
		
		String result = supplier.get();
		
		System.out.println("Result , "+result);
		
		System.out.println("Result , "+supplier1.get());
		System.out.println(mycomparable.compareTo(supplier1.get(),supplier2.get()));
		
		Consumer<Product> consumer = product -> System.out.println(product);
		
		consumer.accept(supplier1.get());
		
		Predicate<Product> predicate = (Product p) -> p.getPrice() >= 75000.0;
		
		System.out.println(predicate.test(supplier1.get()));
		
		Function<Product, String> getName = product -> product.getProductName();
		System.out.println("Name ,"+getName.apply(supplier1.get()));
		
		// Supplier
		// Consumer
		// Predicate
		// Function
	}

}
