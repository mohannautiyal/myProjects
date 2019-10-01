package com.home.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.home.entities.country;
import com.home.entities.president;

@Repository
@Transactional
public class countryDao {
	
	@PersistenceContext
	EntityManager em;
	
	
	public String getHeadOfState(int id) {
		country ctry = em.find(country.class, id);
		president president =  ctry.getPresident();
		return  president.getName();
		
		
		
	}
	

    public country getCountry(int id) {
		
		return em.find(president.class, id).getCountry();
		
		
	}
	
	
    public void saveCountry() {
    	
    	president president = new president("xyx new Pres");
    //	em.persist(president);
    	country country = new country("countryxyx",president);
    	em.persist(country);
    	
    }
	
}
