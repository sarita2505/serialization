package com.java.inheritance.not_ser_child;

import java.io.Serializable;

public class A implements Serializable {
    int i;

    public A() {
    }

    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }
}
