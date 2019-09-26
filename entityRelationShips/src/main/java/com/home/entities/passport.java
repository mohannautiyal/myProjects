package com.home.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class passport {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int Passport_Id;

	@Column(nullable = false)
	private String name;

	@OneToOne(fetch=FetchType.LAZY,mappedBy="passport")
	private Student Student;

	public Student getStudent() {
		return Student;
	}

	public void setStudent(Student student) {
		Student = student;
	}

	public int getPassport_Id() {
		return Passport_Id;
	}

	public void setPassport_Id(int passport_Id) {
		Passport_Id = passport_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "passport [Passport_Id=" + Passport_Id + ", name=" + name + "]";
	}

	public passport(String name) {
		super();
		this.name = name;
	}

	public passport() {

	}

}
