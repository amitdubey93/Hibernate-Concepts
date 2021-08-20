package com.hibernateproject;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	UserDetails1 user = new UserDetails1();
    	//user.setUserId(1);
    	user.setUserName("Arya");
    	user.setJoinDate(new Date());
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(user);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
