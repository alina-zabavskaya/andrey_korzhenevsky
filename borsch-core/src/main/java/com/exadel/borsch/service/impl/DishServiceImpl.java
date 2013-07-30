package com.exadel.borsch.service.impl;

import com.exadel.borsch.dao.DishDAO;
import com.exadel.borsch.entity.Dish;
import com.exadel.borsch.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public class DishServiceImpl implements DishService {
    @Autowired
    private DishDAO dishDAO;

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public List<Dish> list() {
        return dishDAO.getProducts();
    }

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public List<Dish> list(Date selectedDate) {
        return dishDAO.getProducts(selectedDate);
    }

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    @Override
    public void saveDish(Dish dish) {
        dishDAO.saveDish(dish);
    }


}