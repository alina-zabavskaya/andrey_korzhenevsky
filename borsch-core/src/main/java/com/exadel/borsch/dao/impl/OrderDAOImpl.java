package com.exadel.borsch.dao.impl;

import com.exadel.borsch.dao.OrderDAO;
import com.exadel.borsch.entity.Order;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


public class OrderDAOImpl extends JdbcDaoSupport implements OrderDAO {
    private static final String QUERY_SELECT_ALL = "select id, user_id, odata from oorder";

    private static final String QUERY_SELECT_BY_DATE =
            "select id, user_id from oorder where odata=?";

    private static final String QUERY_ORDER_BY_ID = QUERY_SELECT_ALL + " where id=?";

    private static final String QUERY_SELECT_USER_DISHES_BY_DATE =
            "select dish_id, number from dish_in_order dio "
                    + "inner join oorder o on dio.oorder=o.id "
                    + "where o.user_id=? and o.odata=?";

    private static final String QUERY_SELECT_DISHES_BY_DATE =
            "select dio.dish_id, dio.number from dish_in_order dio "
                    + "inner join oorder o on dio.oorder=o.id "
                    + "where and o.odata=?";

    private final RowMapper<Order> orderRowMapper = new RowMapper<Order>() {
        @Override
        public Order mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return new Order(
                    resultSet.getInt("id"),
                    resultSet.getInt("user_id"),
                    resultSet.getDate("odata")
            );
        }
    };

    @Override
    public List<Order> getAllOrders() {
        return getJdbcTemplate().query(
                QUERY_SELECT_ALL,
                orderRowMapper
        );
    }

    @Override
    public Order findById(Integer id) {
        try {
            return getJdbcTemplate().queryForObject(
                    QUERY_ORDER_BY_ID,
                    new Object[]{id},
                    orderRowMapper
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


    @Override
    public List<Order> getOrdersByDate(Date selectedDate) {
        return getJdbcTemplate().query(
                QUERY_SELECT_BY_DATE,
                orderRowMapper,
                selectedDate
        );
    }

    @Override
    public List<Order> getUserDishesByDate(Integer id, Date selectedDate) {
        return getJdbcTemplate().query(
                QUERY_SELECT_USER_DISHES_BY_DATE,
                orderRowMapper,
                selectedDate
        );
    }

    @Override
    public List<Order> getDishesByDate(Date selectedDate) {
        return getJdbcTemplate().query(
                QUERY_SELECT_DISHES_BY_DATE,
                orderRowMapper,
                selectedDate
        );
    }

}


