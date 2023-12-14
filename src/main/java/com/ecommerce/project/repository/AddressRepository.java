package com.ecommerce.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.model.User;
@Repository
public interface AddressRepository extends JpaRepository<User, Integer> {
	
}
