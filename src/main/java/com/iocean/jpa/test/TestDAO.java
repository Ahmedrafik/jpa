package com.iocean.jpa.test;

import com.iocean.jpa.hibernate.Book;
import com.iocean.jpa.hibernate.BookDAO;
import com.iocean.jpa.hibernate.Client;
import com.iocean.jpa.hibernate.ClientDAO;
import com.iocean.jpa.hibernate.Gender;

public class TestDAO {

	public static void main(String[] args) {
		
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
		
		BookDAO bookdao = new BookDAO();
		ClientDAO clientdao = new ClientDAO();
		
		bookdao.saveBook(book1);
		bookdao.saveBook(book2);
		bookdao.saveBook(book3);
		bookdao.saveBook(book4);
		bookdao.saveBook(book5);
		bookdao.saveBook(book6);
		bookdao.saveBook(book7);
		
		clientdao.saveClient(client1);
		clientdao.saveClient(client2);
		clientdao.saveClient(client3);
		clientdao.saveClient(client4);
		clientdao.saveClient(client5);

	}

}
