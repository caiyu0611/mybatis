package com.njzhenghou.entity;

import java.util.Date;

public class Person {

    private Integer id;
    private String name;
    private Integer age;
    private Date birth;
    private Date registerTime;
    private double salary;

    public Person() {
    }

    public Person(Integer id, String name, Integer age, Date birth, Date registerTime, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.registerTime = registerTime;
        this.salary = salary;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", registerTime=" + registerTime +
                ", salary=" + salary +
                '}';
    }
}
