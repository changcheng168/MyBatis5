package com.cc.po;

import java.util.List;

//用户持久化类
public class User {
    private Integer id;
    private String username;
    private String address;
    private List<Orders> ordersList;//用户关联的订单

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public User(Integer id, String username, String address, List<Orders> ordersList) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.ordersList = ordersList;
    }
}
