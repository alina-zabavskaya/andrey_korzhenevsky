package com.exadel.borsch.dao.impl;

import com.exadel.borsch.dao.SomeEntityDao;

import java.util.Random;

/**
 * @author skrauchenia
 */
public class RandomDaoImpl implements SomeEntityDao {

    @Override
    public Integer getEntityId() {
        return new Random().nextInt();
    }
}
