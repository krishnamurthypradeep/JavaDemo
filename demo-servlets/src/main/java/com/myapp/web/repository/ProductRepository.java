package com.myapp.web.repository;

import java.util.ArrayList;
import java.util.List;

import com.myapp.web.model.Product;

public class ProductRepository {

	
	private final List<Product> products = new ArrayList<>();
	
	
	public ProductRepository() {
		// TODO Auto-generated constructor stub
		
		products.add(new Product(1, "Iphone15", 85456.5));
		products.add(new Product(3, "Oneplus11R", 55456.5));
		products.add(new Product(2, "SamsungFlip", 45456.5));
	}
	
	public List<Product> getProducts(){
		return products;
	}
}
