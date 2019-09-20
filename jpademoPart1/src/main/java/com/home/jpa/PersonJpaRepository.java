package com.home.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.entity.person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

	public person findById(int id) {
		return entityManager.find(person.class, id);
	}

	public person insertPerson(person person) {

		return entityManager.merge(person);
	}

	public person updatePerson(person person) {

		return entityManager.merge(person);
	}

	public void deleteById(int id) {

		person person = findById(id);
		entityManager.remove(person);
	}
	
	
	public List<person> findAll(){
		TypedQuery<person> namedQuery= entityManager.createNamedQuery("find_all_persons",person.class);
		return namedQuery.getResultList();
		
	}

}
