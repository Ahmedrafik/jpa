package com.iocean.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.iocean.jpa.hibernate.*;

public class JpaTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Book book1 = new Book("L'île au enfants", "Casimir");
		Book book2 = new Book("Le tour du monde en 80 jours", "Victor Hugo");
		Book book3 = new Book("Ferrari toute une histoire", "Michael Schumacher");
		Book book4 = new Book("Avenger Rassemblement", "Marvel");
		Book book5 = new Book("Clash of Clan la solus", "Dr X");
		Book book6 = new Book("Star Wars Episode N", "Disney");
		Book book7 = new Book("Dragon Ball", "Akira Toriyama");
		
		Client client1 = new Client("Goldman", "Jean Jacques", Gender.Male);
		Client client2 = new Client("Neige", "Blanche", Gender.Female);
		Client client3 = new Client("Charmant", "Le Prince", Gender.Male);
		Client client4 = new Client("Potter", "Harry", Gender.Male);
		Client client5 = new Client("Castor", "Père", Gender.Male);

		
		em.persist(book1);
		em.persist(book2);
		em.persist(book3);
		em.persist(book4);
		em.persist(book5);
		em.persist(book6);
		em.persist(book7);
		
		em.persist(client1);
		em.persist(client2);
		em.persist(client3);
		em.persist(client4);
		em.persist(client5);
	
		em.getTransaction().commit();
		em.close();
		

	}

}
