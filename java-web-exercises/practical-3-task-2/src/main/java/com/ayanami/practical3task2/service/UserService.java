package com.ayanami.practical3task2.service;

import com.ayanami.practical3task2.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User createUser(User user);
    Optional<User> updateUser(Long id, User user);
    void deleteUser(Long id);
}
