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
	
	
	public String DeleteById(Long id) {
		
		Course course = findById(id);		
		em.remove(course);
		
		return "Entity with " + id + " deleted";
		
	}
	
	
	public Course SaveCourse(Course Course) {		
		if(Course.getId()==null) {
			em.persist(Course);
		}
		else
		 em.merge(Course);			
		
		return Course;
	}
	
	

}
