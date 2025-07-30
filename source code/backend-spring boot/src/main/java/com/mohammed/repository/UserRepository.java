package com.mohammed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammed.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
