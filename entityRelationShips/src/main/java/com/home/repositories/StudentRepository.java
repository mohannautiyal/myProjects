package com.home.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.home.entities.Student;
import com.home.entities.passport;

@Repository
@Transactional
public class StudentRepository {

	@PersistenceContext
	EntityManager em;

	public Student getStudentById(int Id) {

		Student st = em.find(Student.class, Id);

		return st;
	}

	
	public Student saveStudent(Student student, passport passport) {
		em.persist(passport);
		student.setPassport(passport);
		em.persist(student);
		return student;

	}

}
