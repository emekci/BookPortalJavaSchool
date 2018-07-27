package com.obss.springmvc.dao.impl;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.obss.springmvc.dao.BooksDao;
import com.obss.springmvc.model.Books;

@Repository("booksDao")
public class BooksDaoImpl implements BooksDao {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Books addBook(Books book) {
		String sql = "INSERT INTO books(author_id,name) VALUES (?,?)";
		Object[] input = new Object[] { book.getAuthor_id(), book.getName() };
		int result = getJdbcTemplate().update(sql, input);
		if (result > 0) {
			return book;
		} else {
			System.out.println("Something went wrong!");
			return null;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public Books updateBook(int id, Books book) {
		String sql = "UPDATE books SET author_id=?,name=? WHERE id=?";
		Object[] inputs = new Object[] { book.getAuthor_id(), book.getName(), id };
		int result = getJdbcTemplate().update(sql, inputs);
		if (result > 0) {
			return book;
		} else {
			System.out.println("Somethin went wrong when updating book!");
			return null;
		}
	}

	@Override
	public void deleteBook(int id) {
		String sql = "DELETE FROM books WHERE id=?";
		Object[] inputs = new Object[] { id };
		int result = getJdbcTemplate().update(sql, inputs);
		if (result > 0) {
			System.out.println("Successfuly DELETED!");
		} else {

			System.out.println("Error Occurred");

		}
	}

	@Override
	public Books showBook(int id) {
		String sql = "SELECT * FROM books WHERE id = ?";
		Books book = getJdbcTemplate().queryForObject(sql, BeanPropertyRowMapper.newInstance(Books.class), id);
		return book;
	}

	@Override
	public List<Map<String, Object>> getBooks() {
		String sql = "SELECT * FROM books";
		List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
		return list;
	}

}
