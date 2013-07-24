package com.exadel.borsch.entity;

public class Dish {
    private Integer id;
    private String name;
    private Integer price;
    private String info;
    private String img;

    public Dish(Integer id, String name, Integer price, String info, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info = info;
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
