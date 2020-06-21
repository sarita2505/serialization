package com.java.inheritance.not_ser_child;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//bcz A implements serializable so b call automatically serialized..how to restrict it..by readObject and writeObject
public class B extends A {
    private String name;

    public B() {
        System.out.println("b default cons");
    }

    public B(int i, String name) {
        super(i);
        this.name = name;
    }

    private void writeObject(ObjectOutputStream outputStream) throws NotSerializableException {
        throw new NotSerializableException();
    }

    private void readObject(ObjectInputStream inputStream) throws NotSerializableException {
        throw new NotSerializableException();

    }
}
