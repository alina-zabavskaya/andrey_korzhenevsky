package com.exadel.borsch.web.controllers;


import com.exadel.borsch.dao.impl.DishDAOImpl;
import org.junit.Test;

public class TestClass {
    @Test
    public void foo() {
        DishDAOImpl dishDAO = new DishDAOImpl();

        System.out.println(dishDAO.findById(12345));
    }
}
