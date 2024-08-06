package com.myapp.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myapp.spring.domain.Product;

//@RestResource
public interface ProductRepository extends MongoRepository<Product, String> {
	
	List<Product> findByProductName(String productName);

	
}
