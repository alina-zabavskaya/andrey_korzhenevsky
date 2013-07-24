package com.exadel.borsch.dao.impl;

import com.exadel.borsch.dao.DishDAO;
import com.exadel.borsch.entity.Dish;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class DishDAOImpl extends JdbcDaoSupport implements DishDAO {
    private static final String QUERY_SELECT_ALL = "select id, name, price, info from dish";

    private static final String QUERY_DISH_BY_ID = QUERY_SELECT_ALL + " where id=?";

    private static final String QUERY_DELETE_DISH = "delete from dish where id=?";

    private static final String QUERY_DISH_INSERT = "insert into dish (name, price, info) values(?,?,?) returning id";

    // private static final String QUERY_DISH_UPDATE = "update dish set name=?, price=?, info=? where id=?";

    private final RowMapper<Dish> dishRowMapper = new RowMapper<Dish>() {
        @Override
        public Dish mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return new Dish(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("price"),
                    resultSet.getString("info"),
                    resultSet.getString("img")
            );
        }
    };

    @Override
    public List<Dish> getProducts() {
        return getJdbcTemplate().query(
                QUERY_SELECT_ALL,
                dishRowMapper
        );
    }

    @Override
    public Dish findById(Integer id) {
        try {
            return getJdbcTemplate().queryForObject(
                    QUERY_DISH_BY_ID,
                    new Object[]{id},
                    dishRowMapper
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


    @Override
    public void deleteDish(Integer id) {
        getJdbcTemplate().update(QUERY_DELETE_DISH, id);
    }

    @Override
    public void saveDish(Dish dish) {
        getJdbcTemplate().update(
                QUERY_DISH_INSERT,
                dish.getName(),
                dish.getPrice(),
                dish.getInfo()
        );
    }
}


