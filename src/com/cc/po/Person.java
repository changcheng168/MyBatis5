package com.cc.po;

import java.util.PrimitiveIterator;

//个人持久化类
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private IdCard card;//对卡表的引用

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", card=" + card +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public Person(Integer id, String name, Integer age, String sex, IdCard card) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.card = card;
    }
}
