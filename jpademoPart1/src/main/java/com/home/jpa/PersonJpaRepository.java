package com.home.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.entity.person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public person findById(int id) {
		return entityManager.find(person.class,id);
	}

}
