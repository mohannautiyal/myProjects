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
	
	
	public president getHeadOfState(int id) {
		
		return em.find(country.class, id).getPresident();
		
		
	}
	

    public country getCountry(int id) {
		
		return em.find(president.class, id).getCountry();
		
		
	}
	
	
  //  @Transactional
    public void saveCountry() {
    	
    	president president = new president("xyx new Pres");
    //	em.persist(president);
    	country country = new country("countryxyx",president);
    	em.persist(country);
    	
    }
	
}
