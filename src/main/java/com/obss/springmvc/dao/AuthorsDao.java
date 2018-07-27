package com.obss.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.obss.springmvc.model.Authors;

public interface AuthorsDao {
	public Authors addAuthor(Authors author);

	public void deleteAuthor(int id);

	public Authors updateAuthor(int id, Authors author);

	public Authors showAuthor(int id);

	List<Map<String, Object>> getAuthors();
}
