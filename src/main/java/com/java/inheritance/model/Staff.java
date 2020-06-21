package com.java.inheritance.model;

import java.io.Serializable;

public class Staff extends Person implements Serializable {
    private int id;

//    public Staff() {
//        System.out.println("staff class default cons. is called");
//    }
//
//    public Staff(int id) {
//        this.id = id;
//    }

    public Staff(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                '}';
    }
}
