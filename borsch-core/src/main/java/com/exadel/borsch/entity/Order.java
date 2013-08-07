package com.exadel.borsch.entity;
import java.sql.Timestamp;
import java.util.Date;

public class Order {
    private Integer id;
    private Integer user_id;
    private Date data;
    private Integer cancelled;

    public Order(Integer id, Integer userId, Date data, Integer cancelled) {
        this.id = id;
        this.user_id = userId;
        this.data = data;
        this.cancelled=cancelled;
    }

    public Date getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer userId) {
        this.user_id = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }
}
