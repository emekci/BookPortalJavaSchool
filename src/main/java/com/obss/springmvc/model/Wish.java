package com.obss.springmvc.model;

import javax.validation.constraints.NotNull;

public class Wish {
	@NotNull
	private int authorId;
	
	@NotNull
	private int bookId;
	@NotNull
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


}
