package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserLogin;

@Service

public class AuthService {
	
public String authenticateUser(UserLogin user) {
		
		String validUsername ="Rahul";
		String validPassword = "123rahul";
		
		if(validUsername.equals(user.getUsername()) && validPassword.equals(user.getPassword())) {
			
			return "authenticated-" + user.getUsername();
		}
		
		else {
			return null;
		}
	}

}
