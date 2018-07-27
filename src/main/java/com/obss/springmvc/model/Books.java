package com.obss.springmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Books {

	@NotNull
	@Size(min = 2, message = "Please enter valid id!")
	private int id;

	@NotNull
	@Size(min = 2, message = "Please enter valid author id!")
	private int author_id;

	@NotNull
	@Size(min = 2, message = "Please enter valid name!")
	private String name;

	@Override
	public String toString() {
		return "Books [id=" + id + ", author_id=" + author_id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
