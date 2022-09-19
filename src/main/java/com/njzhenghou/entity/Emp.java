package com.njzhenghou.entity;

public class Emp {
    private Integer id;
    private String name;
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer id, String name, Dept dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
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

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
