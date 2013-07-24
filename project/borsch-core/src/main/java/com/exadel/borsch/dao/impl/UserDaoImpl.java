package com.exadel.borsch.dao.impl;

import com.exadel.borsch.dao.UserDAO;
import com.exadel.borsch.entity.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl extends JdbcDaoSupport implements UserDAO {

    private static final String SELECT_ALL = "SELECT * FROM user";
    private static final String INSERT = "INSERT INTO user (login, password, role, info, email) VALUES (?, ?, ?, ?, ?)";

    private final RowMapper<User> userRowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));
            user.setRole(resultSet.getInt("role"));
            user.setInfo(resultSet.getString("info"));
            return user;
        }
    };

    @Override
    public List<User> list() {
        return getJdbcTemplate().query(SELECT_ALL, userRowMapper);
    }

    @Override
    public void insert(User user) {
        getJdbcTemplate().update(INSERT, new Object[]{
                user.getLogin(),
                user.getPassword(),
                user.getRole(),
                user.getInfo(),
                user.getEmail()
        });
    }
}
