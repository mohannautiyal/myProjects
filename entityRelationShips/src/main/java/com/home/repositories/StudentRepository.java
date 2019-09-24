package com.home.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.home.entities.Student;

@Repository
@Transactional
public class StudentRepository {

	@PersistenceContext
	EntityManager em;

	public Student getStudentById(int Id) {

		Student st = em.find(Student.class, Id);

		return st;
	}

}
