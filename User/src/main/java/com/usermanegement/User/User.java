package com.usermanegement.User;

public class User {
    private Integer userId;

    private String name;
    private String username;
    private String address;
    private String phoneNumber;

    public User(Integer userId, String name, String username, String address, String phone_Number) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
