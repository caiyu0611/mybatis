package com.njzhenghou.entity;

import java.util.Date;

public class Cat {
    private Integer id ;
    private String catName;
    private int age;
    private Date brith;

    public Cat() {
    }

    public Cat(Integer id, String catName, int age, Date brith) {
        this.id = id;
        this.catName = catName;
        this.age = age;
        this.brith = brith;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", catName='" + catName + '\'' +
                ", age=" + age +
                ", brith=" + brith +
                '}';
    }
}
