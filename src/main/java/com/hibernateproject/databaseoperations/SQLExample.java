package com.hibernateproject.databaseoperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample{
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		NativeQuery<Object[]> query = s.createSQLQuery("select user_name,email from user_details where user_id>:ID");
		query.setParameter("ID", 172);
		List<Object[]> list = query.list();
		for(Object[] ob: list){
			System.out.println("UserName: "+ob[0]+" Email: "+ob[1]);
		}
		
		s.close();
	}
}
