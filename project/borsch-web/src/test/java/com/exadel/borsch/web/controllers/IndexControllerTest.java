package com.exadel.borsch.web.controllers;

import com.exadel.borsch.dao.impl.DishDAOImpl;
import org.junit.Test;


/**
 * @author skrauchenia
 */
public class IndexControllerTest extends BaseSpringMvcTest {

    @Test
    public void testHomePage() throws Exception {
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("home"));
    }

    @Test
    public void daoTest() {
        DishDAOImpl dishDAO = new DishDAOImpl();
        System.out.print(dishDAO.findById(123));
    }
}
