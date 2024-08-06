package com.myapp.spring.web.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.domain.Product;
import com.myapp.spring.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductRepository productRepository;
	
	
	
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	
	@GetMapping()
	public List<Product> sloadAll(){
		return productRepository.findAll();
	}


	@GetMapping("/{productName}")
	public Product searchByName(@PathVariable("productName")  String productName){
		return productRepository.findByProductName(productName).get(0);
	}

}
