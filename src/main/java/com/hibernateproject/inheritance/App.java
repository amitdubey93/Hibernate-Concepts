package com.hibernateproject.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employee emp = new Employee();
    	emp.setEmployeeName("Arya");
    	
    	RegularEmployee regEmp = new RegularEmployee();
    	regEmp.setEmployeeName("Amit");
    	regEmp.setSalary(20000);
    	
    	ContractEmployee contractEmp = new ContractEmployee();
    	contractEmp.setEmployeeName("Golu");
    	contractEmp.setPayPerHour(2000);
    	
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(emp);
    	session.save(regEmp);
    	session.save(contractEmp);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
