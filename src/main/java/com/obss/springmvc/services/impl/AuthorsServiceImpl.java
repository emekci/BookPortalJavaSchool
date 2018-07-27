package com.obss.springmvc.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obss.springmvc.dao.AuthorsDao;
import com.obss.springmvc.model.Authors;
import com.obss.springmvc.services.AuthorsService;

@Service
public class AuthorsServiceImpl implements AuthorsService {

	@Autowired
	private AuthorsDao authorsDao;

	public List<Map<String, Object>> getAuthors() {
		// TODO Auto-generated method stub
		return authorsDao.getAuthors();
	}

	@Override
	public Authors addAuthors(Authors authors) {
		// TODO Auto-generated method stub
		return authorsDao.addAuthor(authors);
	}

	@Override
	public Authors showAuthors(int id) {
		// TODO Auto-generated method stub
		return authorsDao.showAuthor(id);
	}

	@Override
	public Authors updateAuthors(int id, Authors authors) {
		// TODO Auto-generated method stub
		return authorsDao.updateAuthor(id, authors);
	}

	@Override
	public void deleteAuthors(int id) {
		// TODO Auto-generated method stub
		authorsDao.deleteAuthor(id);

	}

}
