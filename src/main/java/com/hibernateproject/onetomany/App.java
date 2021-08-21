package com.hibernateproject.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop laptop1 = new Laptop();
    	laptop1.setLaptopName("HP Notebook");
    	Laptop laptop2 = new Laptop();
    	laptop2.setLaptopName("Acer Laptop");
    	UserDetails5 user = new UserDetails5();
    	//user.setUserId(1);
    	user.setUserName("Arya");
    	user.getLaptops().add(laptop1);
    	user.getLaptops().add(laptop2);
    	laptop1.setUser(user);
    	laptop2.setUser(user);
    	
    	
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(user);
    	//session.save(laptop1);
    	//session.save(laptop2);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
