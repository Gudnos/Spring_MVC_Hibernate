package ru.spring.dao;

import ru.spring.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    User getUser(Long id);

    void deleteUser(User user);
}
