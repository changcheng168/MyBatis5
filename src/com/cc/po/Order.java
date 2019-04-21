package com.cc.po;
//订单持久化类
public class Order {
    private Integer id;

    public Order() {
    }

    private String number;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Order(Integer id, String number) {
        this.id = id;
        this.number = number;
    }
}
