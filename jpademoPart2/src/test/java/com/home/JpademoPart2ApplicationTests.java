package com.home;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.home.entity.Course;
import com.home.repository.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpademoPart2Application.class)
public class JpademoPart2ApplicationTests {

	@Autowired
	CourseRepository courseRepo;

	@Test
	public void FindCoursebyID() {

		assertTrue("Find Course By Id failed", courseRepo.findById(1003L).getName().equalsIgnoreCase("Rest Services"));
		;
	}

	@Test
	@DirtiesContext
	public void DeleteById() {
		courseRepo.DeleteById(1002L);
		assertNull("Delete by Id failed", courseRepo.findById(1002L));

	}

	@Test
	public void SaveCourse() {
		Course course = courseRepo.findById(1002L);
		course.setName("Python Programming");
		courseRepo.SaveCourse(course);
		assertTrue("Save Course Failed", courseRepo.findById(1002L).getName().equals("Python Programming"));

	}

}
