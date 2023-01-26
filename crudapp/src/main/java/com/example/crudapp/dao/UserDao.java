package com.example.crudapp.dao;

import com.example.crudapp.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> listUsers();
    void updateUser(long id, User user);
    void deleteUser(long id);
    User getUserById(long id);
}
