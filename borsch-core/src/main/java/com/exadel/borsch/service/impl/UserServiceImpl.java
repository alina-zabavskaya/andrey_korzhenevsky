package com.exadel.borsch.service.impl;

import com.exadel.borsch.dao.UserDAO;
import com.exadel.borsch.entity.User;
import com.exadel.borsch.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceImpl implements UserService{
    private Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserDAO userDAO;

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public List<User> list() {
        return userDAO.getUsers();
    }

    @Transactional(readOnly = true)
    public User findUser(String login) {
        return userDAO.findByLogin(login);
    }
}
