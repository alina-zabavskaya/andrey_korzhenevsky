package com.exadel.borsch.dao.impl;

import com.exadel.borsch.dao.DishInOrderDAO;
import com.exadel.borsch.entity.DishInOrder;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class DishInOrderDAOImpl extends JdbcDaoSupport implements DishInOrderDAO {
    private static final String QUERY_SELECT_ALL = "select "
            + "dish_in_order_id, "
            + "dish_id, "
            + "onumber, "
            + "oorder from dish_in_order";

     private final RowMapper<DishInOrder> dishInOrderRowMapper = new RowMapper<DishInOrder>() {
         @Override
         public DishInOrder mapRow(ResultSet resultSet, int rowNum) throws SQLException {
             return new DishInOrder(
                     resultSet.getInt("dish_in_order_id"),
                     resultSet.getInt("dish_id"),
                     resultSet.getInt("onumber"),
                     resultSet.getInt("oorder")
             );
         }
     };

    @Override
    public List<DishInOrder> getDishesInOrder() {
        return getJdbcTemplate().query(
                QUERY_SELECT_ALL,
                dishInOrderRowMapper
        );
    }

}


