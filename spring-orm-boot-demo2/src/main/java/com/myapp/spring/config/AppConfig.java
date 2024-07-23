package com.myapp.spring.config;

import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;

import com.myapp.spring.domain.Address;
import com.myapp.spring.domain.Student;
import com.zaxxer.hikari.HikariDataSource;

import jakarta.persistence.EntityManagerFactory;

@Configuration
//@ComponentScan(basePackages = "com.myapp.spring")
//@EnableTransactionManagement
public class AppConfig {
	
	@Bean
	Student student(List<Address> address) {
		
		return new Student("Student1","CS", "5", address);
	}
	
	@Bean
	Address address() {
		return new Address("MGRoad","bengaluru", 560001L);
	}
	
	@Bean
	Address address1() {
		return new Address("Kormangala","bengaluru", 560065L);
	}
	
	@Bean
	Address address2() {
		return new Address("Hebbal","mysuru", 570065L);
	}
	
	
	
	
	
	

}

// ORM 
// JPA
// Hibernate


