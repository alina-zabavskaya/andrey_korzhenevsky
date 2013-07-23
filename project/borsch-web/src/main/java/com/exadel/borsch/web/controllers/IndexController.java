package com.exadel.borsch.web.controllers;

import com.exadel.borsch.service.ServiceFactory;
import com.exadel.borsch.service.SomeBusinessLogicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Simple index page controller
 */
@Controller
public class IndexController {

    private SomeBusinessLogicService service = ServiceFactory.getSomeBusinessLogicService();

    @RequestMapping(value = "enter.page", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "enter";
    }

    @RequestMapping(value = "index.page", method = RequestMethod.GET)
    public String handleRequest() {
        return "index";
    }
}
