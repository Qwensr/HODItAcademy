package com.example.HODItAcademy.service;

import com.example.HODItAcademy.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User registerUser(User user);
    boolean authenticateUser(String username, String password);

}
