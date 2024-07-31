package com.myapp.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.spring.domain.Student;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;

@Service
public class StudentServiceImpl implements StudentService {
	
	private EntityManager em;
	
	
	
	

	public StudentServiceImpl(EntityManager em) {
		this.em = em;
	}





	//@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		EntityGraph<Student> entityGraph = 	em.createEntityGraph(Student.class);
		entityGraph.addAttributeNodes("address");
			
			return (List<Student>)em.createQuery("select s from Student s",Student.class)
					.setHint("jakarta.persistence.fetchgraph",entityGraph).getResultList();
						
	}

//	@Override
//	public List<Student> findAll() {
//		
//			EntityGraph<Student> entityGraph = 	em.createEntityGraph(Student.class);
//			entityGraph.addAttributeNodes("address");
//				
//				return (List<Student>)em.createQuery("select s from Student s",Student.class)
//						.setHint("jakarta.persistence.fetchgraph",entityGraph).getResultList();
//						
//				
//				
//				
//	}

}
