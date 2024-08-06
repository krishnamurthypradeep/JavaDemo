package com.myapp.spring.product.client;

import java.time.Duration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

@Configuration
public class ProductClient {
	
	private static final String PRODUCTS_ROOT_API = "http://PRODUCT-MS/api/products/";
	private final WebClient.Builder webClient;
	
	public ProductClient(WebClient.Builder webClient) {
		this.webClient = webClient;
	}
	
	public Product getProductByName(String productName) {
		
		return webClient.baseUrl(PRODUCTS_ROOT_API+productName).build().get()
				.retrieve().bodyToMono(Product.class)
				.timeout(Duration.ofSeconds(3), Mono.empty())
				.retryWhen(Retry.backoff(3,Duration.ofMillis(100)))
				.block();
			
				
				
	}

}
