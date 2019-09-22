package com.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.repository.CourseRepository;

@SpringBootApplication
public class JpademoPart2Application implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepo;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public static void main(String[] args) {
		SpringApplication.run(JpademoPart2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Find course by id -> {}",courseRepo.findById(1001L));
		
		courseRepo.DeleteById(1001L);
		//logger.info("Deleted -->_{},courseRepo.);
		
		
		
	}

}
