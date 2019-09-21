package com.home.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.entity.Course;

@Repository
@Transactional	
public class CourseRepository {
	
	
	@PersistenceContext
	EntityManager em;
	
	public Course findById(Long id) {
		
		return em.find(Course.class, id);
	}

}
