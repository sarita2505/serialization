package com.java.inheritance.model;

public class Person {
    String name;

//    public Person() {
//        name="radhe";
//        System.out.println("person class default cons. is called");
//    }

    public Person(String name) {
        this.name = name;
        System.out.println("person class para cons. is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
