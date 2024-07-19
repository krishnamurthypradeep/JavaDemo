package com.myapp.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import com.myapp.spring.domain.Student;
import com.myapp.spring.domain.StudentReport;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;


@Repository
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE)
public class StudentRepositoryImpl implements StudentRepository {
	
	@PersistenceContext(name = "entityManagerFactory")
	@Qualifier(value = "entityManagerFactory")
	private EntityManager em;
	
	@Autowired
	private TransactionTemplate template;
	
	
	
	
	public StudentRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	

//public StudentRepositoryImpl(EntityManagerFactory emf) {
//		this.emf = emf;
//	}



	@Override
	public Student save(Student student) {
		
		Integer id = template.execute( status  -> {
			em.persist(student);
			
			return student.getId();
			
		});
		
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
		student.setId(id);
		return student;
	}


	// NOSQL
	
	// Document Database => MongoDB
	// Large Column Database => Cassandra
	// Key Value Database => Redis, DynamoDB
	// Graph Database => Neo4J

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		// JPQL
	@SuppressWarnings("unchecked")
	List<Student> list=	template.execute( status  -> {
	EntityGraph<Student> entityGraph = 	em.createEntityGraph(Student.class);
	entityGraph.addAttributeNodes("address");
		
		return em.createQuery("select s from Student s",Student.class)
				.setHint("jakarta.persistence.fetchgraph",entityGraph).getResultList();
				
		});
		
		return list;
	}



	@Override
	public List<StudentReport> findAllReports() {
		// TODO Auto-generated method stub
		
		return em.createNamedQuery(Student.STUDENT_REPORT).getResultList();
		
	}



	@Override
	public List<Student> findStudentsByBranchAndSemester(String branch, String semester) {
		// TODO Auto-generated method stub
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Student> cq=  cb.createQuery(Student.class);
		Root<Student> student =   cq.from(Student.class);
		Predicate branchPredicate = cb.equal(student.get("branch"), branch);
		Predicate semesterPredicate = cb.equal(student.get("semester"), semester);
		cq.where(branchPredicate,semesterPredicate);
		
		TypedQuery<Student> query =  em.createQuery(cq);
		return query.getResultList();
		
	}

}


// Table  = Collections
// Row => Document

// Database
// MongoDB , Cloud Based Setup (SAAS -> DBAAS)


