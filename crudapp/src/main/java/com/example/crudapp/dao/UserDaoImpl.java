package com.example.crudapp.dao;

import com.example.crudapp.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }
    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    @Override
    public void updateUser(long id, User user) {
        User update = entityManager.find(User.class, id);
        update.setName(user.getName());
        update.setLastname(user.getLastname());
        update.setEmail(user.getEmail());
        entityManager.merge(update);
    }
    @Override
    public void deleteUser(long id) {
        User delete = entityManager.find(User.class, id);
        entityManager.remove(delete);
    }
    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
}
