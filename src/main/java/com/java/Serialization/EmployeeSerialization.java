package com.java.Serialization;

import com.java.model.Address;
import com.java.model.Employee;

import java.io.*;

public class EmployeeSerialization  {
    public static void main(String[] args) {
        Address address=new Address("odisha","India");
        Employee employee=new Employee("namish",1,address);
        FileOutputStream outputStream;
        {
            try {
                outputStream = new FileOutputStream("emp.ser");
                ObjectOutputStream outputStream1=new ObjectOutputStream(outputStream);
                outputStream1.writeObject(employee);
                outputStream.close();
                outputStream1.close();

            } catch (FileNotFoundException e) {
                System.out.println("file not found"+e);
            } catch (IOException e) {
                System.out.println("can not ableto write"+e);
            }
        }
    }

}
