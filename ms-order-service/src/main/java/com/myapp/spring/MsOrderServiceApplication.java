package com.myapp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOrderServiceApplication.class, args);
	}

}
