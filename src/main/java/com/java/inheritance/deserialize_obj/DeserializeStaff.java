package com.java.inheritance.deserialize_obj;

import com.java.inheritance.model.Staff;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStaff {
    public static void main(String[] args) {
        //Staff staff=new Staff();
        Staff staff=null;
        try {
            FileInputStream inputStream=new FileInputStream("stf.ser");
            ObjectInputStream inputStream1=new ObjectInputStream(inputStream);
            staff=(Staff) inputStream1.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("file not found " +e);
        } catch (IOException e) {
            System.out.println("ioexception "+e);
        } catch (ClassNotFoundException e) {
            System.out.println("classNotFound "+e);
        }
        System.out.println(staff.getName());
    }
}
