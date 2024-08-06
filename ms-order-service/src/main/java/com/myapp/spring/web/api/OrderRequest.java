package com.myapp.spring.web.api;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OrderRequest (
		
		@NotBlank(message="Product Name must be defined")
		String productName,
		
		@NotNull(message="Product quantity must be defined")
		@Min(value=1,message = "You Must Order atleast 1 item")
		@Max(value=5,message = "You cannot Order more than 5 items")
		Integer quantity
		) {

}
