package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserDB;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api/user")

public class UserController {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository= userRepository;
		
	}
	
	@PostMapping
	public String addUser(@RequestBody UserDB user) {
		userRepository.save(user);
		return "UserDB added Sucessfully";
		
	}

}
