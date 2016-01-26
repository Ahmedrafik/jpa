package com.iocean.jpa.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class BookDAO {

	public Book saveBook(Book b){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		return b;
	}
	
	public Book getBook(int id){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		Book b = em.find(Book.class, id);
		em.close();
		return b;
	}
	
	public Book updateBook(Book b){
		EntityManagerFactory emf = PersistenceManagerFactorySingleton.instance();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(b);
		em.getTransaction().commit();
		em.close();
		return b;
	}
	
}
