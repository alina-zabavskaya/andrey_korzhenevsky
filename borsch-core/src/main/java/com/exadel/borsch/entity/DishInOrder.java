package com.exadel.borsch.entity;

public class DishInOrder {

    private Integer dishInOrderId;
    private Integer dishId;
    private Integer onumber;
    private Integer oorder;

    public DishInOrder(Integer dishId, Integer onumber, Integer oorder) {
        this.dishId = dishId;
        this.onumber = onumber;
        this.oorder = oorder;
    }

    public DishInOrder(Integer dishInOrderId, Integer dishId, Integer onumber, Integer oorder) {
        this.dishInOrderId = dishInOrderId;
        this.dishId = dishId;
        this.onumber = onumber;
        this.oorder = oorder;
    }


    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getId() {
        return dishInOrderId;
    }

    public void setId(Integer dishInOrderId) {
        this.dishInOrderId = dishInOrderId;
    }

    public Integer getNumber() {
        return onumber;
    }

    public void setNumber(Integer number) {
        this.onumber = number;
    }

    public Integer getOorder() {
        return oorder;
    }

    public void setOorder(Integer oorder) {
        this.oorder = oorder;
    }


}
