package com.java.deserialization;

import com.java.model.Address;
import com.java.model.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {
    public static void main(String[] args) {
        Address address=new Address();
        Employee employee=new Employee();
        try {
            FileInputStream inputStream=new FileInputStream("emp.ser");
            ObjectInputStream inputStream1=new ObjectInputStream(inputStream);
            employee=(Employee) inputStream1.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("file not found"+e);
        } catch (IOException e) {
            System.out.println("can not deserialize object" +e);
        } catch (ClassNotFoundException e) {
            System.out.println("class not found" +e);
        }
        System.out.println("employee name is " +employee.getEmpName());
        System.out.println("employee id is " +employee.getId());
        address=employee.getAddress();
        System.out.println("country is : " +address.getCountry());
        System.out.println("state is : " +address.getState());

    }
}
