package com.iocean.jpa.hibernate;


import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Book {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String title;
	
	@Column
	private String author;
	
	@OneToMany(mappedBy = "favorite")
	private List<Client> fans;
	
	@ManyToMany(mappedBy="buy")
	private List<Client> buyer;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void addFans(Client c){
		this.fans.add(c);
	}
	
	public void addBuyer(Client c){
		this.buyer.add(c);
	}
	
	public void removeFans(Client c){
		this.fans.remove(c);
	}
	
	public void removeBuyer(Client c){
		this.buyer.remove(c);
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	
}
