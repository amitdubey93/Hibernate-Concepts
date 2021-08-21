package com.hibernateproject.databaseoperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class NamedQueryExample {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();

		/*Query q = s.getNamedQuery("UserDetails.byId");
		q.setParameter("userId", 172);
		List<UserDetails> users = q.list();
		for(UserDetails user:users)
		System.out.println(user);*/
		
		Query q = s.getNamedNativeQuery("UserDetails.byName");
		q.setParameter("userName", "User 20");
		List<Object[]> users = q.list();
		for(Object[] user:users)
		System.out.println(user[0]);
		
		s.close();
	}
}
