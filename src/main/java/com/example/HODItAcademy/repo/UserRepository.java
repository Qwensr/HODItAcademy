package com.example.HODItAcademy.repo;

import com.example.HODItAcademy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByUsernameAndPassword(String username, String password);
}
