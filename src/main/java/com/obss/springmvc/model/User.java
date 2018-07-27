package com.obss.springmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@NotNull
	@Size(min = 2, message = "Please enter valid name!")
	private String name;
	
	@NotNull
	@Size(min = 2, message = "Please enter valid Surname!")
	private String surname;

	@NotNull
	@Size(min = 3, message = "Please enter valid password!")
	private String password;

	@NotNull
	@Size(min = 5, message = "Please enter valid email address!")
	private String email;

	@NotNull
	@Size(min = 2, message = "Please enter valid id!")
	private int id;

	@NotNull
	@Size(min = 2, message = "Please enter valid role!")
	private int role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getsurname() {
		return surname;
	}

	public void setsurname(String surName) {
		this.surname = surName;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
