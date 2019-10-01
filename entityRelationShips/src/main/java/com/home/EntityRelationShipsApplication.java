package com.home;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.entities.Review;
import com.home.entities.Student;
import com.home.entities.passport;
import com.home.repositories.StudentRepository;

@SpringBootApplication
public class EntityRelationShipsApplication implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRep;

	public static void main(String[] args) {
		SpringApplication.run(EntityRelationShipsApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		/*
		 * System.out.println(studentRep.getStudentById(1001));
		 * studentRep.saveStudent(new Student("Kritika Singh"), new
		 * passport("EM394828")); System.out.println("Student saved successfully");
		 * 
		 * passport passport=studentRep.getPassport(2001); String name =
		 * passport.getStudent().getName();
		 * System.out.println("Name of student with passport id 200 is "+name);
		  */
		
		/*
		 * System.out.println("===============================================");
		 * System.out.println("Course Review Details are as below :");
		 * 
		 * 
		 * List<Review> reviews =studentRep.getReviews(3004);
		 * 
		 * for(Review review:reviews) { System.out.println(review.getRating() + "   "
		 * +review.getDescription());
		 * 
		 * }
		 * 
		 * System.out.println("===============================================");
		 * 
		 * studentRep.insertReview(3002, "****", "Its an average course");
		 * 
		 */
		System.out.println("===========================================");
		List<Student> students =studentRep.getStudentsInCourse(3004);
		for(Student student: students) {
			System.out.println(student.getName());
			;
		}
		

	}

}
