package com.hibernateproject.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student student1 = new Student();
    	//user.setUserId(1);
    	student1.setStudentName("Arya");
    	
    	Course course1 = new Course();
    	course1.setCourseName("Java");
    	
    	Course course2 = new Course();
    	course2.setCourseName("Hibernate");
    	
    	student1.getCourses().add(course1);
    	student1.getCourses().add(course2);
    	
    	course1.getStudents().add(student1);
    	course2.getStudents().add(student1);
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.persist(student1);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
