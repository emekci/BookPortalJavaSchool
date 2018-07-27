package com.obss.springmvc.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obss.springmvc.dao.UsersDao;
import com.obss.springmvc.model.User;
import com.obss.springmvc.services.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDao usersDao;

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return usersDao.addUser(user);
	}

	public User showUser(int id) {
		// TODO Auto-generated method stub
		return usersDao.showUser(id);
	}

	public User updateUser(int id, User user) {
		// TODO Auto-generated method stub
		return usersDao.updateUser(id, user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		usersDao.deleteUser(id);
	}

	@Override
	public List<Map<String, Object>> getUsers() {
		return usersDao.getUsers() ;
	}

	



}
