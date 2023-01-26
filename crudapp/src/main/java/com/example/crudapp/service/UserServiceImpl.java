package com.example.crudapp.service;

import com.example.crudapp.dao.UserDao;
import com.example.crudapp.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
    @Transactional
    @Override
    public void updateUser(long id, User user) {
        userDao.updateUser(id, user);
    }
    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }
    @Transactional
    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
}
