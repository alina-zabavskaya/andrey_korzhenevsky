package com.exadel.borsch.entity;
import java.sql.Timestamp;

public class Order {
    private Integer id;
    private Integer user_id;
    private Integer dish_id;
    private Timestamp data;
    private Integer number;

    public Timestamp getData() {
        return data;
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

    public Integer getDish_id() {
        return dish_id;
    }

    public void setDish_id(Integer dish_id) {
        this.dish_id = dish_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
