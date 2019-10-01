package com.home.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int Id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy="course")
	private List<Review> Reviews = new ArrayList<Review>();

		public int getId() {
		return Id;
	}
		
    
    @ManyToMany(mappedBy="course")		
    private List<Student> student = new ArrayList<Student>();

	public List<Student> getStudent() {
		return student;
	}

	public void addStudent(Student student) {
		this.student.add(student);
	}

	public void setId(int id) {
		Id = id;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Review> getReviews() {
		return Reviews;
	}

	public void addReview(Review review) {
		this.Reviews.add(review);
	}

	public void removeReview(Review review) {
		this.Reviews.remove(review);
	}

	public Course(String name) {
		super();
		this.name = name;
	}
	
	public Course() {
		
	}

}
