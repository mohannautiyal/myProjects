package com.home;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.entity.person;
import com.home.jdbc.personJDBCdao;

@SpringBootApplication
public class JpademoApplication implements CommandLineRunner {

	@Autowired
	personJDBCdao personDao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Inserting into person {}",personDao.insertIntoPerson(new person(1006,"Rajesh","Mumbai",new Date())));
 
		logger.info("Find All -> {}" ,personDao.findAll());
		
		logger.info("Find by id -> {}", personDao.findbyId(1001));
		
		logger.info("No of rows deleted --> {} " ,personDao.deletebyId(1002));
		
		logger.info("updating id 1001 --> {}",personDao.updatePerson(new person(1006,"Ranjan","Calcuatta",new Date())));
		
		System.out.println("================================================");
		logger.info("Find All -> {}" ,personDao.findAll());
	
	}

}
