package com.home;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.repositories.countryDao;

@SpringBootApplication

public class OneToOneRelationApplication implements CommandLineRunner {

	@Autowired
	countryDao countryDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	//	countryDao.saveCountry();
		System.out.println("Head of State is "+countryDao.getHeadOfState(1001));
		//System.out.println("Country is "+countryDao.getCountry(2002).getName());

		
	}

}
