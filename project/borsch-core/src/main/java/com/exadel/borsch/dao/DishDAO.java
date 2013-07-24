package com.exadel.borsch.dao;

import com.exadel.borsch.entity.Dish;

import java.util.List;

public interface DishDAO {

    List<Dish> getProducts();

    Dish findById(Integer id);

    void saveDish(Dish dish);

    void deleteDish(Integer id);

}
