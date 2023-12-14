package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.User;
import com.ecommerce.project.service.AddressService;
@RestController
@RequestMapping(value = "/user")
public class UserAddressController 
{
	@Autowired
	private AddressService addressService;
	
	 @PostMapping("/saveUserAddress")
	    public User saveUser(@RequestBody User user) {
	        return addressService.saveUser(user);
	    }

	 @GetMapping("/getUser/{userId}")
	    public User getUser(@PathVariable int userId) {
	        return addressService.getUserById(userId);
	    }
	 
	 @PutMapping("/updateUser/{userId}")
	    public User updateUser(@PathVariable int userId, @RequestBody User user) {
	        User existingUser = addressService.getUserById(userId);
	        if (existingUser != null) {
	            existingUser.setName(user.getName());
	            existingUser.setEmail(user.getEmail());
	            existingUser.setAddress(user.getAddress());
	            return addressService.saveUser(existingUser);
	        } else {
	            return null;
	        }
	    }
	
	 	@DeleteMapping("/deleteUser/{userId}")
	    public String deleteUser(@PathVariable int userId) {
	        User existingUser = addressService.getUserById(userId);
	        if (existingUser != null) {
	            addressService.deleteUser(existingUser);
	            return "User with ID: " + userId + " deleted successfully";
	        } else {
	            return "User with ID: " + userId + " not found";
	        }
	    }
}