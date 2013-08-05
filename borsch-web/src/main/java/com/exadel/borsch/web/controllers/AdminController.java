package com.exadel.borsch.web.controllers;

import com.exadel.borsch.entity.Dish;
import com.exadel.borsch.service.DishInOrderService;
import com.exadel.borsch.service.DishService;
import com.exadel.borsch.service.OrderService;
import com.exadel.borsch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private OrderService orderService;

    @Autowired
    private DishInOrderService dishInOrderService;

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

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public ModelAndView orders() {
        Map params = new HashMap();
        params.put("orders", orderService.list());
        params.put("users", userService.list());
        params.put("dishes", dishService.list());
        params.put("dios", dishInOrderService.list());
        return new ModelAndView("admin.orders", params);
    }
}


