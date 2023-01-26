package com.example.crudapp.service;

import com.example.crudapp.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    List<User> listUsers();
    void updateUser(long id, User user);
    void deleteUser(long id);
    User getUserById(long id);
}
