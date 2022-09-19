package com.njzhenghou.entity;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private double score;
    private Date brith;
    private int age;

    public Student() {
    }

    public Student(Integer id, String name, double score, Date brith, int age) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.brith = brith;
        this.age = age;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", brith=" + brith +
                ", age=" + age +
                '}';
    }
}
