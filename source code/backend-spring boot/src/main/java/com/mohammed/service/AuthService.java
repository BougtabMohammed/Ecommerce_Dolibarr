package com.mohammed.service;

import com.mohammed.exception.SellerException;
import com.mohammed.exception.UserException;
import com.mohammed.request.LoginRequest;
import com.mohammed.request.SignupRequest;
import com.mohammed.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
