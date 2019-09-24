package com.home.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int Student_Id;
	
	@Column(nullable=false)
	private String name;
	
	@OneToOne
	private passport passport;

	public int getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n Student [Student_Id=" + Student_Id + ", name=" + name + "]";
	}
	
	public Student() {
		
	}

}
