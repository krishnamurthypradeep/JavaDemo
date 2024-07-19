package com.myapp.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import com.myapp.spring.domain.Address;
import com.myapp.spring.domain.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE)
public class AddressRepositoryImpl implements AddressRepository {
	
	@PersistenceContext(name = "entityManagerFactory")
	@Qualifier(value = "entityManagerFactory")
	private EntityManager em;
	
	@Autowired
	private TransactionTemplate template;
	
	
	
	
	public AddressRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	

//public StudentRepositoryImpl(EntityManagerFactory emf) {
//		this.emf = emf;
//	}



	@Override
	public Address save(Address address) {
		
		Integer id = (Integer) template.execute( status  -> {
			em.persist(address);
			return address.getId();
			
			
		});
		
		address.setId(id);
		return address;
		
//		// insert into 
//		EntityTransaction trxn  = null;
//		try {
//			 trxn = em.getTransaction();
//			em.persist(student);
//			trxn.commit();
//			return student;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			trxn.rollback();
//		}
////		em.persist(student);
		
	}



	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		// JPQL
		return em.createQuery("select s from Student s").getResultList();
	}

}
