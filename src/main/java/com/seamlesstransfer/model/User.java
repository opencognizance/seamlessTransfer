package com.seamlesstransfer.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*
	 * @AbhishekDas
	 * id will be generated per user by system
	 * username and password are the user input fields
	 * 
	 * */
	private Long id;
	private String username;
	private String password;
	
	public User() {}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//Getters and Setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
