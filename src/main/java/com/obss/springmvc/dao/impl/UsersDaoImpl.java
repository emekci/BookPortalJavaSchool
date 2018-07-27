package com.obss.springmvc.dao.impl;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.obss.springmvc.dao.UsersDao;
import com.obss.springmvc.model.User;

@Repository("usersDao")
public class UsersDaoImpl implements UsersDao {
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

	public User addUser(User user) {
		String sql = "INSERT INTO users (password,name,surname,email,role) VALUES (?, ?, ?, ?, ?) ";
		Object[] inputs = new Object[] { user.getPassword(), user.getName(), user.getsurname(), user.getEmail(),
				user.getRole() };
		int result = getJdbcTemplate().update(sql, inputs);
		if (result > 0) {
			return user;
		} else {

			System.out.println("Something went wrong!");
			return null;
		}

	}

	public User updateUser(int id, User user) {
		String sql = "UPDATE users SET name= ? , surname= ? ,password=?, email=?,role=?  WHERE id=?";
		Object[] inputs = new Object[] { user.getName(), user.getsurname(), user.getPassword(), user.getEmail(),
				user.getRole(), id };
		int result = getJdbcTemplate().update(sql, inputs);
		if (result > 0) {
			return user;
		} else {

			System.out.println("Something went wrong!");
			return null;
		}
	}

	public void deleteUser(int id) {
		String sql = "DELETE FROM users WHERE id =?";

		Object[] input = new Object[] { id };
		int result = getJdbcTemplate().update(sql, input);
		if (result > 0) {
			System.out.println("Successfuly DELETED!");
		} else {

			System.out.println("Error Occurred");

		}
	}

	public User showUser(int id) {
		String sql = "SELECT * FROM users WHERE id=?";
		User user = getJdbcTemplate().queryForObject(sql, BeanPropertyRowMapper.newInstance(User.class), id);
		return user;

	}

	@Override
	public List<Map<String, Object>> getUsers() {
		String sql = "SELECT * FROM users";
		List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
		return list;
	}

}
