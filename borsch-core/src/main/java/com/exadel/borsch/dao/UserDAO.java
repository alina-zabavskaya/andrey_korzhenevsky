package com.exadel.borsch.dao;

import com.exadel.borsch.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User findByLogin(String login);
    User findById(Integer id);
    void saveUser(User dish);
    void deleteUser(Integer id);
}
