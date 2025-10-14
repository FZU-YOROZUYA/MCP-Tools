package com.yorozuya.mcp_tools.domain;


import java.security.Timestamp;

public class User {
    private int id;
    private String username;
    private String password;
    private Timestamp createdTime;

    public User() {
    }

    public User(int id, String username, String password, Timestamp createdTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createdTime = createdTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }
}
