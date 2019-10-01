package com.home.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class president {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;

	public president(String name) {
		super();
		this.name = name;
	}
	
	public president() {
		
	}

	@OneToOne(mappedBy="president")
	private country country;
	
	
	public country getCountry() {
		return country;
	}

	public void setCountry(country country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
