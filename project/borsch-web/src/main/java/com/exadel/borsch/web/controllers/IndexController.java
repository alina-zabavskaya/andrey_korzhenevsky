package com.exadel.borsch.web.controllers;

import com.exadel.borsch.service.ServiceFactory;
import com.exadel.borsch.service.SomeBusinessLogicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Simple index page controller
 */
@Controller
public class IndexController {

    private SomeBusinessLogicService service = ServiceFactory.getSomeBusinessLogicService();

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public String showRegistrationForn() {
        return "enter";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView handleRequest() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("value", service.doSomeWork());
        return model;
    }

}
