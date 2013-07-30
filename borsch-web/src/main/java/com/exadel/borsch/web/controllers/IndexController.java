package com.exadel.borsch.web.controllers;

import com.exadel.borsch.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple index page controller
 */
@Controller
//@RequestMapping(value = "/borsch-web")
public class IndexController {
    @Autowired
    DishService dishService;

    @RequestMapping(value = "/sec/menu/dishes/{date}", method = RequestMethod.GET)
    public ModelAndView dishes(@PathVariable() String date) {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        Date selectedDate;
        if (date == null) {
            selectedDate = new Date();
        } else {
            try {
                selectedDate = DATE_FORMAT.parse(date);
            } catch (ParseException e) {
                selectedDate = new Date();
            }
        }
        Map params = new HashMap();
//        params.put("dishes", dishService.list(selectedDate));
        params.put("dishes", dishService.list());
        return new ModelAndView("dishes.list", params);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model, Principal principal) {
        String name = null;
        if (principal != null) {
            name = principal.getName();
        }
        model.addAttribute("username", name);
        return "index";
    }

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "enter";
    }

    @RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("error", "true");
        return "enter";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "enter";
    }
}
