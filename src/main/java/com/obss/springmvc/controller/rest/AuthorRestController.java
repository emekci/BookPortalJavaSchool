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

import com.obss.springmvc.model.Authors;
import com.obss.springmvc.services.AuthorsService;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {
	@Autowired
	private AuthorsService authorsService;

	@GetMapping("/{id}")
	public Authors showAuthor(int id) {
		return authorsService.showAuthors(id);
	}

	@PostMapping
	public Authors addAuthor(@RequestBody Authors authors) {
		return authorsService.addAuthors(authors);
	}

	@PutMapping("/{id}")
	public Authors updateAuthor(int id, Authors authors) {
		return authorsService.updateAuthors(id, authors);
	}

	@DeleteMapping("/{id}")
	public void deleteAuthor(int id) {
		authorsService.deleteAuthors(id);
	}

	@GetMapping
	public List<Map<String, Object>> getAuthors() {
		return authorsService.getAuthors();
	}

}
