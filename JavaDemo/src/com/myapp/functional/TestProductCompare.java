package com.myapp.functional;

import java.util.Comparator;
import java.util.List;

import com.myapp.oops.Product;

public class TestProductCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product("Iphone15", 75456.5);
		
		Product p2 = new Product("Oneplus11R", 65456.5);
		
		Product p3 = new Product("SamsungFlip", 55456.5);
		
		
		List<Product> products = List.of(p2,p1,p3);
		
		Comparator<Product> cmp =( product1, product2) -> {
		return ((Double)product2.getPrice()).compareTo(product1.getPrice());
		};
		
		List<Product> sortedProducts = products.stream().sorted(cmp).toList();
		
		System.out.println(products);
		
		System.out.println(sortedProducts);
		
		

	}

}
