package com.exadel.borsch.dao;

import com.exadel.borsch.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> list();

    void insert(User user);
}
