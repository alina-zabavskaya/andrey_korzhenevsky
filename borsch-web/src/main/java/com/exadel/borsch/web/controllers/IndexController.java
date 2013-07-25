package com.exadel.borsch.web.controllers;

import com.exadel.borsch.dao.impl.DishDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Simple index page controller
 */
@Controller
public class IndexController {

   // private SomeBusinessLogicService service = ServiceFactory.getSomeBusinessLogicService();

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public String showRegistrationForm() {
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
    DishDAOImpl dishDAO;

}
