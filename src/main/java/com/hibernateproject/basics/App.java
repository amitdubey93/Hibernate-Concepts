package com.hibernateproject.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Address addr = new Address();
    	addr.setStreet("Shivpur");
    	addr.setCity("Howrah");
    	addr.setState("West Bengal");
    	
    	UserDetails2 user = new UserDetails2();
    	//user.setUserId(1);
    	user.setUserName("Arya");
    	user.setAddress(addr);
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(user);
    	//session.save(addr);
    	
    	session.getTransaction().commit();
    	session.close();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
