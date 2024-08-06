package com.myapp.spring.web.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.domain.Order;
import com.myapp.spring.sevice.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	private OrderService orderService;
	
	
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}


	@PostMapping
	public Order submitOrder(@RequestBody @Valid  OrderRequest orderRequest) {
		
		return orderService.placeOrder(orderRequest.productName(),orderRequest.quantity() );
		
	}

}
