package com.exadel.borsch.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String login;
    private String password;
    private String role;
    private String info;
    private String email;

    public User(Integer id, String login, String password, String role, String info, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.info = info;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
