package com.obss.springmvc.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obss.springmvc.dao.BooksDao;
import com.obss.springmvc.model.Books;
import com.obss.springmvc.services.BooksService;

@Service
public class BooksServiceImpl implements BooksService {
	@Autowired
	private BooksDao booksdao;

	@Override
	public Books addBook(Books book) {
		return booksdao.addBook(book);
	}

	@Override
	public List<Map<String, Object>> getBooks() {
		return booksdao.getBooks();
	}

	@Override
	public Books showBook(int id) {
		// TODO Auto-generated method stub
		return booksdao.showBook(id);
	}

	@Override
	public Books updateBook(int id, Books book) {
		// TODO Auto-generated method stub
		return booksdao.updateBook(id, book);
	}

	@Override
	public void deleteBook(int id) {
		booksdao.deleteBook(id);
	}

}
