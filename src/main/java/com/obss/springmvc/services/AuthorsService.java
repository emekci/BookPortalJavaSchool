package com.obss.springmvc.services;

import java.util.List;
import java.util.Map;

import com.obss.springmvc.model.Authors;
import com.obss.springmvc.model.Books;

public interface AuthorsService {
	public Authors addAuthors(Authors authors);

	public Authors showAuthors(int id);

	public Authors updateAuthors(int id, Authors authors);

	public void deleteAuthors(int id);

	public List<Map<String, Object>> getAuthors();
}
