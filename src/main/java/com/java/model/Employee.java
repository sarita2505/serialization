package com.java.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
    private String empName;
    private int id;
    transient private Address address;

    public Employee() {
    }

    public Employee(String empName, int id) {
        this.empName = empName;
        this.id = id;
    }

    public Employee(String empName, int id, Address address) {
        this.empName = empName;
        this.id = id;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private void writeObject(ObjectOutputStream outputStream) {
        try {
            outputStream.defaultWriteObject();
            outputStream.writeObject(address.getState());
            outputStream.writeObject(address.getCountry());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
private void readObject(ObjectInputStream inputStream){
    try {
        inputStream.defaultReadObject();
        String state= (String) inputStream.readObject();
        String country= (String) inputStream.readObject();
        address=new Address(state,country);
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

}
    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}