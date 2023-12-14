package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserDB;

public interface UserRepository extends JpaRepository<UserDB, Long> {
	
	

}
