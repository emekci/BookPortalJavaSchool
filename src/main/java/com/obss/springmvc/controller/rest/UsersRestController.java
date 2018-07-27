package com.obss.springmvc.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obss.springmvc.model.User;
import com.obss.springmvc.services.UsersService;

@RestController
@RequestMapping("/users")
public class UsersRestController {
	@Autowired
	private UsersService usersService;

	@GetMapping("/{id}")
	public User showUser(@PathVariable int id) {
		return usersService.showUser(id);
	}

	@PostMapping
	public User addUser(@RequestBody User user) {
		return usersService.addUser(user);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		return usersService.updateUser(id, user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		usersService.deleteUser(id);
	}

}
