package com.exadel.borsch.entity;
import java.sql.Timestamp;
import java.util.Date;

public class Order {
    private Integer id;
    private Integer userId;
    private Date data;

    public Order(Integer id, Integer userId, Date data) {
        this.id = id;
        this.userId = userId;
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

//    public Order(Timestamp data, Integer userId) {
//        this.data = data;
//        this.user_id = userId;
//    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
