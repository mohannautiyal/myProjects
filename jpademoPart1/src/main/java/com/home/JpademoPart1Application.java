package com.home;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.entity.person;
import com.home.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpademoPart1Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository jpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpademoPart1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("JPA Find by id implemented --> {}", jpaRepository.findById(1001));

		logger.info("Inserting new member -->{}",
				jpaRepository.insertPerson(new person(12, "Shishir", "Banglore", new Date())));

		logger.info("Update new member -->{}",
				jpaRepository.insertPerson(new person(1, "Sumit", "Banglore", new Date())));

		jpaRepository.deleteById(1001);
		
		logger.info("Printing all the members --> {}",jpaRepository.findAll());

	}

}
