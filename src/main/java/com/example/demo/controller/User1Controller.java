package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reward;
import com.example.demo.repository.RewardRepository;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api/users")

public class User1Controller {
	
	private RewardRepository rewardRepository;

	@Autowired
	public User1Controller(RewardRepository rewardRepository) {
		this.rewardRepository= rewardRepository;
	}
	
	@PostMapping
	public String addUser(@RequestBody Reward user) {
        rewardRepository.save(user);
        return "User added Successfully";
    }
	
}
