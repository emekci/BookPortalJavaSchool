package com.obss.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.obss.springmvc.model.Books;

public interface BooksDao {
	public Books addBook(Books book);

	public Books showBook(int id);

	public Books updateBook(int id, Books book);

	public void deleteBook(int id);

	List<Map<String, Object>> getBooks();
}
