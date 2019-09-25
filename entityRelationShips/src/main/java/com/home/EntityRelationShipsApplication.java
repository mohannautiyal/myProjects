package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	public void run(String... args) throws Exception {

		System.out.println(studentRep.getStudentById(1001));
		studentRep.saveStudent(new Student("Kritika Singh"), new passport("EM394828"));
		System.out.println("Student saved successfully");
		
	}

}
