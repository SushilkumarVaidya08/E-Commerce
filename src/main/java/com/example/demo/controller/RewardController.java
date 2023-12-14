package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reward;
import com.example.demo.repository.RewardRepository;

@RestController
@RequestMapping("/api/rewards")

public class RewardController {
	
	 private final RewardRepository rewardRepository;

	    @Autowired
	    public RewardController(RewardRepository rewardRepository) {
	        this.rewardRepository = rewardRepository;
	    }

	    @PostMapping
	    public String addReward(@RequestBody Reward reward) {
	        rewardRepository.save(reward);
	        return "Reward added successfully";
	    }

}
