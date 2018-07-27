package com.obss.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.obss.springmvc.model.User;

public interface UsersDao {
	public User addUser(User user);

	public User showUser(int id);

	public User updateUser(int id, User user);

	public void deleteUser(int id);

	List<Map<String, Object>> getUsers();

}
