package com.hibernateproject.collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Address addr1 = new Address();
    	addr1.setStreet("Shivpur");
    	addr1.setCity("Howrah");
    	addr1.setState("West Bengal");
    	
    	Address addr2 = new Address();
    	addr2.setStreet("Shivji Park");
    	addr2.setCity("Gurugram");
    	addr2.setState("Haryana");
    	
    	UserDetails3 user = new UserDetails3();
    	//user.setUserId(1);
    	user.setUserName("Arya");
    	
    	user.getListOfAddresses().add(addr1);
    	user.getListOfAddresses().add(addr2);
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(user);
    	//session.save(addr);
    	
    	session.getTransaction().commit();
    	session.close();
    	user = null;
    	session = sessionFactory.openSession();
    	session.beginTransaction();
    	user = (UserDetails3)session.get(UserDetails3.class, 7);
    	System.out.println(user);
    	session.getTransaction().commit();
    	session.close();
    	System.out.println(user.getListOfAddresses().size());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
