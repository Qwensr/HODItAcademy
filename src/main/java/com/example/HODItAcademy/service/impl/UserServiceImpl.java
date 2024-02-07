package com.example.HODItAcademy.service.impl;

import com.example.HODItAcademy.entity.User;
import com.example.HODItAcademy.repo.UserRepository;
import com.example.HODItAcademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired

    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        return userRepository.existsByUsernameAndPassword(username, password);
    }
}
