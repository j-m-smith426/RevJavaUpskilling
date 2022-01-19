package com.smith.beans;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class DAO {
	private Session session;
	private SessionFactory factory;
	private Transaction transaction;

	public DAO() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		factory = meta.getSessionFactoryBuilder().build();
		session = factory.openSession();
		
		
	}
	
	public User saveUser(User user) {
		
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
	
		return user;
	}
	
	public User findByID(Long id) {
		
		User retrievedUser = session.find(User.class, id);
		
		return retrievedUser;
	}
	
	public List<User> findAll(){
		
		List<User> users = session.createQuery("from User").getResultList();
		
		return users;
	}
	
	public List<User> findByLastName(String name){
		List<User> users = session.createQuery("FROM User WHERE lastName=:name").setParameter("name", name).getResultList();
		return users;
	}
	
	public void close() {
		
		factory.close();
		session.close();
	}
}
