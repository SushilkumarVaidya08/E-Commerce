package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserLogin;
import com.example.demo.service.AuthService;

@RestController
@RequestMapping("/api")

public class AuthController {
	
	private final AuthService authService ;
	
	@Autowired
	public AuthController(AuthService authService) {
		this.authService =authService;
		
		}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody UserLogin user) {
        String token = authService.authenticateUser(user);
        return ResponseEntity.ok(token);
    }
	
	
	
}
