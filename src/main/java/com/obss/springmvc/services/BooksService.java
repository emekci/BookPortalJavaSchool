package com.obss.springmvc.services;

import java.util.List;
import java.util.Map;

import com.obss.springmvc.model.Books;

public interface BooksService {
	public Books addBook(Books book);

	public Books showBook(int id);

	public Books updateBook(int id, Books book);

	public void deleteBook(int id);

	public List<Map<String, Object>> getBooks();
}
