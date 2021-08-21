package com.hibernateproject.manytomany;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course", joinColumns=@JoinColumn(name="student_id"),
			inverseJoinColumns=@JoinColumn(name="course_id"))
	private Collection<Course> courses = new ArrayList<Course>();

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Collection<Course> getCourses() {
		return courses;
	}

	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}
	
	
}
