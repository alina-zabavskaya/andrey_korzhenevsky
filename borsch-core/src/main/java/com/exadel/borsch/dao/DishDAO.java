package com.exadel.borsch.dao;

import com.exadel.borsch.entity.Dish;

import java.util.Date;
import java.util.List;

public interface DishDAO {

    List<Dish> getProducts();
    Dish findById(Integer id);
    void saveDish(Dish dish);
    void deleteDish(Integer id);

    List<Dish> getProducts(Date selectedDate);
}
