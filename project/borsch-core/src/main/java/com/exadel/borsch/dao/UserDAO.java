package com.exadel.borsch.dao;

import com.exadel.borsch.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> list();

    void insert(User user);
}