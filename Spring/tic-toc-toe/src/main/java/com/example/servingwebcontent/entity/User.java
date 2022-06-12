package com.example.servingwebcontent.entity;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Utente")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
