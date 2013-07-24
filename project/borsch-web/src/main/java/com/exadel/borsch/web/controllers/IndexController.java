package com.exadel.borsch.web.controllers;

import com.exadel.borsch.dao.UserDAO;
import com.exadel.borsch.service.ServiceFactory;
import com.exadel.borsch.service.SomeBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Simple index page controller
 */
@Controller
public class IndexController {

    @Autowired
    private UserDAO UserDaoImpl;

    public void setUserDaoImpl(UserDAO userDaoImpl) {
        this.UserDaoImpl = userDaoImpl;
    }

    private SomeBusinessLogicService service = ServiceFactory.getSomeBusinessLogicService();

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public String showRegistrationForm() {
//        User user = new User();
//        user.setLogin("Vasya");
//        user.setPassword("asdasd");
//        user.setRole(1);
//        user.setEmail("email@mail.ru");
//        user.setInfo("adasdasd");
//        userDao.insert(user);
        return "enter";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String handleRequest() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexRequest() {
        return "index";
    }
}
