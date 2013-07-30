package com.exadel.borsch.web.controllers;

import com.exadel.borsch.entity.Dish;
import com.exadel.borsch.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    DishService dishService;


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
        model.addAttribute("success", "Блюдо добавлено.");
        dishService.saveDish(dish);
        return "admin/showAddDishForm";
    }

}
