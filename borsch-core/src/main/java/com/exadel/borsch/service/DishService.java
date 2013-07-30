package com.exadel.borsch.service;

import com.exadel.borsch.entity.Dish;

import java.util.Date;
import java.util.List;

public interface DishService {
    List<Dish> list();
    List<Dish> list(Date selectedDate);
}
