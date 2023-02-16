package com.vegetable.shop.service;

import com.vegetable.shop.Entities.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void login(String username, String password);
    User findByUsername(String username);
    User findByEmail(String email);
    User findById(long id);
    List<User> fetchAll();

    void deleteById(Long id);

}
