package com.ecommerce.project.service;

import com.ecommerce.project.model.User;
public interface AddressService {
	public User saveUser(User user);
	public User getUserById(int userId);
	void deleteUser(User user);
}
