package com.home.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.home.entity.emp;

@Repository
public interface empDao extends CrudRepository<emp,Integer> {
	
	public Iterable<emp> findByJob(String job);

}
