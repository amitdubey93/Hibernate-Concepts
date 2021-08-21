package com.hibernateproject.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id @GeneratedValue
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="course_name")
	private String courseName;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="courses")
	private Collection<Student> students = new ArrayList<Student>();
	
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Collection<Student> getStudents() {
		return students;
	}

	public void setStudents(Collection<Student> students) {
		this.students = students;
	}
	
}
