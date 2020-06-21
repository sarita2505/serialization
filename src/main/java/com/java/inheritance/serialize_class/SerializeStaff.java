package com.java.inheritance.serialize_class;

import com.java.inheritance.model.Staff;

import java.io.*;

public class SerializeStaff {
    public static void main(String[] args) {
        Staff staff=new Staff("harish",1);
        try {
            FileOutputStream outputStream=new FileOutputStream("stf.ser");
            ObjectOutputStream outputStream1=new ObjectOutputStream(outputStream);
            outputStream1.writeObject(staff);
            outputStream.close();
            outputStream1.close();
        } catch (FileNotFoundException e) {
            System.out.println("filr is not found" +e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
