package com.home.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.home.entities.Course;
import com.home.entities.Review;
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

	
	public passport getPassport(int id) {
		passport passport = em.find(passport.class, id);
		return passport;
		
	}
	
	
	
	
	public Student saveStudent(Student student, passport passport) {
		em.persist(passport);
		student.setPassport(passport);
		em.persist(student);
		return student;

	}

	
	public List<Review> getReviews(int id){
		
	  return	em.find(Course.class, id).getReviews();
	}
	
	
	public void insertReview(int id,String rating, String review) {
		

	Course Course =	em.find(Course.class, id);
	
	Review Review = new Review(rating,review);
	Review.setCourse(Course);
	em.persist(Review);
	Course.addReview(Review);
		
	}
	
	
	public List<Student> getStudentsInCourse(int id) {
		
		
	Course course= 	em.find(Course.class, id);
	List<Student> students = course.getStudent();
	
	return students;
		
	}
	
	
}
