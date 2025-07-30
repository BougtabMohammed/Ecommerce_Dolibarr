package com.mohammed.service;

import com.mohammed.exception.UserException;
import com.mohammed.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
