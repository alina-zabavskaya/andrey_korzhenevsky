package com.exadel.borsch.entity;
import java.sql.Timestamp;

public class Order {
    private Integer id;
    private Integer userId;
    private Integer dishId;
    private Timestamp data;
    private Integer number;

    public Timestamp getData() {
        return this.data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

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
