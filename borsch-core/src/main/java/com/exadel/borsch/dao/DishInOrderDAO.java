package com.exadel.borsch.dao;

import com.exadel.borsch.entity.DishInOrder;

import java.util.List;

public interface DishInOrderDAO {

    List<DishInOrder> getDishesInOrder();

    //List<Dish> getProducts(Date selectedDate);
}
