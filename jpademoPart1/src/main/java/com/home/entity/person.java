package com.home.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class person {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private Date birthDate;
	
	
	public person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	@Override
	public String toString() {
		return "\n person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}


	public person() {
		
		
	}

}