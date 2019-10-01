package com.home.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class country {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;

	@OneToOne(cascade= {CascadeType.ALL}, fetch=FetchType.LAZY)
	private president president;
	
	public country() {
		
	}
	
	public country(String name, president president) {
		super();
		this.name = name;
		this.president = president;
	}

	public president getPresident() {
		return president;
	}

	public void setPresident(president president) {
		this.president = president;
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
