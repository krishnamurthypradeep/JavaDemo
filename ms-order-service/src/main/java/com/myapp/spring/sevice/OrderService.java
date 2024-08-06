package com.myapp.spring.sevice;

import org.springframework.stereotype.Service;

import com.myapp.spring.domain.Order;
import com.myapp.spring.product.client.Product;
import com.myapp.spring.product.client.ProductClient;
import com.myapp.spring.repository.OrderRepository;

@Service
public class OrderService {
	
	private final ProductClient productClient;
	
	private final OrderRepository orderRepository;

	public OrderService(ProductClient productClient, OrderRepository orderRepository) {
		this.productClient = productClient;
		this.orderRepository = orderRepository;
	}
	
	
	public Order placeOrder(String productName,int quantity) {
		Product product = productClient.getProductByName(productName);
		Order order= Order.build(productName, product.getPrice(), quantity);
		
		return orderRepository.save(order);
		
	}
	
	
	
	

}
