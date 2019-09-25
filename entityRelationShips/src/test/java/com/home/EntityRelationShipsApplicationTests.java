package com.home;

import static org.junit.Assert.assertTrue;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.home.entities.Student;
import com.home.entities.passport;
import com.home.repositories.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=EntityRelationShipsApplication.class)
public class EntityRelationShipsApplicationTests {

	@Autowired
	StudentRepository studentRepo;

	@Test
	@Transactional
	public void StudentTest() {

		studentRepo.saveStudent(new Student("Kritika Singh"), new passport("EM394828"));

		String StudentName = studentRepo.getStudentById(2).getName();
		System.out.println("Actual Name is " + StudentName);

		String actPassport = studentRepo.getStudentById(2).getPassport().getName();

		System.out.println("Actual Passport is " + actPassport);
		assertTrue("Student not saved", actPassport.equals("EM394828"));

	}

}
