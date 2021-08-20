package com.hibernateproject.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Vehicle vehicle = new Vehicle();
    	vehicle.setVehicleName("BMW");
    	UserDetails4 user = new UserDetails4();
    	//user.setUserId(1);
    	user.setUserName("Arya");
    	user.setVehicle(vehicle);
    	
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(user);
    	//session.save(vehicle);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
