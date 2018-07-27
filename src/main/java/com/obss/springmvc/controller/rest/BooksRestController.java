package com.obss.springmvc.controller.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obss.springmvc.model.Books;
import com.obss.springmvc.services.BooksService;

@RestController
@RequestMapping("/books")
public class BooksRestController {
	@Autowired
	private BooksService booksservice;

	@GetMapping("/{id}")
	public Books showBook(int id) {
		return booksservice.showBook(id);
	}

	@PostMapping
	public Books addBook(@RequestBody Books book) {
		return booksservice.addBook(book);
	}

	@PutMapping("/{id}")
	public Books updateBook(int id, Books book) {
		return booksservice.updateBook(id, book);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(int id) {
		booksservice.deleteBook(id);
	}

	@GetMapping
	public List<Map<String, Object>> getBooks() {
		return booksservice.getBooks();
	}
}
