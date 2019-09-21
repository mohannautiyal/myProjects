package com.home;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.home.repository.CourseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpademoPart2Application.class)
public class JpademoPart2ApplicationTests {
	
	@Autowired
	CourseRepository courseRepo;

	@Test
	public void contextLoads() {
		
		assertTrue("Course Repository failed", courseRepo.findById(1001L).getName().equalsIgnoreCase("Spring Boot"));;
	}

}
