package com.voduchuy.service;

import com.voduchuy.modal.User;
import com.voduchuy.repository.UserRepository;
import com.voduchuy.requests.LoginRequest;
import com.voduchuy.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public LoginResponse authenticateUser(LoginRequest loginRequest) {
        User user = userRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        boolean isAuthenticated = user != null;

        return new LoginResponse(user, isAuthenticated);
    }
}
