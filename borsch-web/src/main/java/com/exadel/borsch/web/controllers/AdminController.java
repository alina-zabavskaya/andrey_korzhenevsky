package com.exadel.borsch.web.controllers;

import com.exadel.borsch.entity.Dish;
import com.exadel.borsch.service.DishService;
import com.exadel.borsch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller

@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private DishService dishService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/adddish", method = RequestMethod.GET)
    public String showAddDishForm() {
        return "admin/showAddDishForm";
    }

    @RequestMapping(value = "/adddish", method = RequestMethod.POST)
    public String addDish(@RequestParam String name,
                          @RequestParam int price,
                          @RequestParam String info,
                          Model model) {
        Dish dish = new Dish(name, price, info);
        dish.setImg("exadel.png");
        model.addAttribute("success", "Блюдо добавлено.");
        dishService.saveDish(dish);
        return "enter";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView users() {
        Map params = new HashMap();
        params.put("users", userService.list());
        return new ModelAndView("users.list", params);
    }
}


