package com.home.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int Student_Id;
	
	@Column(nullable=false)
	private String name;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	private passport passport;
	
	@ManyToMany
	@JoinTable(name="STUDENT_COURSE",joinColumns=@JoinColumn(name="Student_Id"),
			inverseJoinColumns=@JoinColumn(name="Course_Id"))
	private List<Course> course = new ArrayList<Course>();

	public List<Course> getCourse() {
		return course;
	}

	public void addCourse(Course course) {
		this.course.add(course);
	}

	public passport getPassport() {
		return passport;
	}

	public void setPassport(passport passport) {
		this.passport = passport;
	}

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
