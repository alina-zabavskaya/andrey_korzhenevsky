package com.exadel.borsch.service;

import com.exadel.borsch.entity.Dish;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DishService {
    List<Dish> list();
    //List<Dish> list(Date selectedDate);
    void saveDish(Dish dish);
    List<Dish> getProducts();
    void markDish(Map map, String date);
    List<Dish> getProducts(String date);
}
