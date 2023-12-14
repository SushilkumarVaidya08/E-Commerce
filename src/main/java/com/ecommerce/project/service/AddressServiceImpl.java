package com.ecommerce.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.User;
import com.ecommerce.project.repository.AddressRepository;
@Service
public class AddressServiceImpl implements AddressService 
{
	@Autowired
	private AddressRepository addressRepository;
	@Override
	public User saveUser(User user) 
	{
		user = addressRepository.save(user);
		return user;
	}
	
	@Override
    public User getUserById(int userId) {
        return addressRepository.findById(userId).orElse(null);
    }
	
	@Override
    public void deleteUser(User user) {
        addressRepository.delete(user);
    }
	
	 @Override
	    public List<User> getAllUsersWithAddresses() {
	        return addressRepository.findAll();
	    }
}
