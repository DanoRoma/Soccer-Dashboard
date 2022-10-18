package com.dano.soccer.dashboard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dano.soccer.dashboard.entity.User;
import com.dano.soccer.dashboard.services.IUserService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private IUserService userService;

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.findAll();
	}

}
