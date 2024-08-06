package com.myapp.spring;

import static org.springframework.cloud.gateway.server.mvc.filter.CircuitBreakerFilterFunctions.circuitBreaker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import reactor.core.publisher.Mono;

@Configuration
public class WebEndPoints {
	
	@Bean
	 RouterFunction<ServerResponse> routerFunction(){
		return RouterFunctions.route()
				. filter(circuitBreaker(config -> config.setId("productCircuitBreaker")))
				.GET("/product-fallback",request -> ServerResponse.ok().body(Mono.just("Product Service is temporarily unavailable")))
				.POST("/product-fallback",request -> ServerResponse.status(HttpStatus.SERVICE_UNAVAILABLE)
						.build()).build();
	}

}
