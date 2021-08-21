package com.hibernateproject.databaseoperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class HQLExample {
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	//session.beginTransaction();
    	
    	
    	//SELECT QUERY WITH WHERE CLAUSE
    	/*Query<UserDetails> query = session.createQuery("from UserDetails where userName= :userName",UserDetails.class);
    	query.setParameter("userName", "User 1");
    	List<UserDetails> users = query.getResultList();
    	for(UserDetails user : users){
    		System.out.println(user);
    	}*/
    	
    	//DETELTE QUERY
    	/*Query<?> query = session.createQuery("delete from UserDetails where userId = 174");
    	int x = query.executeUpdate();
    	System.out.println("Rows affected: "+x);*/
    	
    	/*Query<?> query = session.createQuery("update UserDetails set userName='Updated User' where userName='User 1'");
    	int x = query.executeUpdate();
    	System.out.println("Rows affected: "+x);*/
    	
    	
    	/*Query query = session.createQuery("select email,password from UserDetails where id>172");
    	List<Object[]> list = query.getResultList();
    	for(Object[] u : list){
    		System.out.println(Arrays.toString(u));
    	}*/
    	
    	
    	//PAGINATION
    	Query q = session.createQuery("from UserDetails");
		q.setFirstResult(5);
		q.setMaxResults(3);
		
		List<UserDetails> list = q.getResultList();
		for(UserDetails u:list){
			System.out.println(u);
		}
    	
    	//session.getTransaction().commit();
    	session.close();
    	
    	
    	/*for(int i=1;i<21;i++){
    		UserDetails user = new UserDetails();
        	user.setUserName("User "+i);
        	user.setEmail("email@email"+i+".com");
        	user.setPassword("password"+i);
        	user.setJoinDate(new Date());
        	
        	session.save(user);
    	}*/
    }
}
