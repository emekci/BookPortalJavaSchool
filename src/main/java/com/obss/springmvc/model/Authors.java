package com.obss.springmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Authors {
	@NotNull
	@Size(min = 2, message = "Please enter valid authors name!")
	private String name;
	@NotNull
	@Size(min = 2, message = "Please enter valid authors surname!")
	private String surName;
	@NotNull
	@Size(min = 2, message = "Please enter valid authors id!")
	private int id;

	@Override
	public String toString() {
		return "Authors [name=" + name + ", surName=" + surName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

}
