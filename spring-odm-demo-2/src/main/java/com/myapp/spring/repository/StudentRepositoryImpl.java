package com.myapp.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.myapp.spring.domain.Student;


@Repository
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE)
public class StudentRepositoryImpl implements StudentRepository {
	
	
	private MongoTemplate mongoTemplate;
	
	
	
	
	public StudentRepositoryImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}



//	public StudentRepositoryImpl() {
//		// TODO Auto-generated constructor stub
//	}
	
	

//public StudentRepositoryImpl(EntityManagerFactory emf) {
//		this.emf = emf;
//	}



	@Override
	public Student save(Student student) {
		
		return mongoTemplate.save(student);
		
//		
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
		
		return mongoTemplate.findAll(Student.class);
	
	}






	@Override
	public List<Student> findStudentsByBranchAndSemester(String branch, String semester) {
//		// TODO Auto-generated method stub
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Student> cq=  cb.createQuery(Student.class);
//		Root<Student> student =   cq.from(Student.class);
//		Predicate branchPredicate = cb.equal(student.get("branch"), branch);
//		Predicate semesterPredicate = cb.equal(student.get("semester"), semester);
//		cq.where(branchPredicate,semesterPredicate);
//		
//		TypedQuery<Student> query =  em.createQuery(cq);
//		return query.getResultList();
		
		
		Query query = new Query();
		query.addCriteria(Criteria.where("branch").is(branch));
		query.addCriteria(Criteria.where("semester").is(semester));
		
		return mongoTemplate.find(query, Student.class);
		
	}



	@Override
	public void delete(Student student) {
		
	mongoTemplate.remove(student);
		
	}

}


// Table  = Collections
// Row => Document

// Database
// MongoDB , Cloud Based Setup (SAAS -> DBAAS)


