package com.obss.springmvc.dao.impl;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.obss.springmvc.dao.AuthorsDao;
import com.obss.springmvc.model.Authors;

@Service
public class AuthorsDaoImpl implements AuthorsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private DataSource datasource;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public Authors addAuthor(Authors author) {
		String sql = "INSERT INTO authors (name,surname) VALUES(? , ?)";
		Object[] inputs = new Object[] { author.getName(), author.getSurName() };
		int result = getJdbcTemplate().update(sql, inputs);
		if (result > 0) {
			return author;
		} else {
			System.out.println("Something went wrong when adding Author!");
			return null;
		}

	}

	@Override
	public void deleteAuthor(int id) {
		String sql = "DELETE FROM authors WHERE id = ?";
		Object[] inputs = new Object[] { id };
		int result = getJdbcTemplate().update(sql, inputs);
		if (result > 0) {
			System.out.println("Author successfuly deleted!");
		} else {
			System.out.println("Author did not deleted!");
		}

	}

	@Override
	public Authors updateAuthor(int id, Authors author) {
		String sql = "UPDATE authors SET name= ? , surname= ? WHERE id = ?";
		Object[] inputs = new Object[] { author.getName(), author.getSurName(), id };
		int result = getJdbcTemplate().update(sql, inputs);
		if (result > 0) {
			return author;
		} else {
			System.out.println("Did not update author!");
			return null;
		}

	}

	@Override
	public Authors showAuthor(int id) {
		String sql = "SELECT * FROM authors WHERE id = ?";
		Authors authors = getJdbcTemplate().queryForObject(sql, BeanPropertyRowMapper.newInstance(Authors.class), id);

		return authors;
	}

	@Override
	public List<Map<String, Object>> getAuthors() {
		String sql = "SELECT * FROM authors";
		List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
		return list;
	}

}
