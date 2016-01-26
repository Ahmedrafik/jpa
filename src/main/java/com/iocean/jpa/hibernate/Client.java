package com.iocean.jpa.hibernate;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Client")
public class Client {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;
	
	@Column
	private String firstname;
	
	@Column
	@Enumerated(value=EnumType.STRING)
	private Gender gender;
	
	@ManyToOne
	private Book favorite;
	
	@ManyToMany
	private List<Book> buy;
	
	public Client(String name, String firstname, Gender gender) {
		this.name = name;
		this.firstname = firstname;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Book getFavorite() {
		return favorite;
	}

	public void setFavorite(Book favorite) {
		this.favorite = favorite;
	}
	
	public void addBuy(Book b){
		this.buy.add(b);
	}
	
	public void removeBuy(Book b){
		this.buy.remove(b);
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", firstname=" + firstname + ", gender=" + gender + "]";
	}
	
	
}
