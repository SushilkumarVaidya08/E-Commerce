package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Reward;

public interface RewardRepository extends JpaRepository<Reward, Long> {
	

}
