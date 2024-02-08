package com.example.HODItAcademy.service.impl;

import com.example.HODItAcademy.entity.User;
import com.example.HODItAcademy.repo.UserRepository;
import com.example.HODItAcademy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        try {
            if (user != null && user.getUsername() != null && user.getEmail() != null && user.getPassword() != null) {
                return userRepository.save(user);
            } else {
                throw new IllegalArgumentException("Invalid user data");
            }
        } catch (Exception e) {
            logger.error("Error during user registration", e);
            throw e;
        }
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        return userRepository.existsByUsernameAndPassword(username, password);
    }
}