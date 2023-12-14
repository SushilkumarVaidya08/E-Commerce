package com.ecommerce.project.service;

import java.util.List;

import com.ecommerce.project.model.User;
public interface AddressService {
	public User saveUser(User user);
	public User getUserById(int userId);
	void deleteUser(User user);
	public List<User> getAllUsersWithAddresses();
}
