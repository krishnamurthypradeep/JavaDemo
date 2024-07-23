package com.myapp.spring.repository;

import java.util.List;

import com.myapp.spring.domain.Address;
import com.myapp.spring.domain.Student;

public interface AddressRepository {
	
	
	Address save(Address address);
	
	List<Student> findAll();

}
