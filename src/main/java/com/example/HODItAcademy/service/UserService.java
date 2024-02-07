package com.example.HODItAcademy.service;

import com.example.HODItAcademy.entity.User;

public interface UserService {
    User registerUser(User user);
    boolean authenticateUser(String username, String password);
}
