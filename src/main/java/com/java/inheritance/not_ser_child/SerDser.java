package com.java.inheritance.not_ser_child;

import java.io.*;

public class SerDser {
    public static void main(String[] args) {
        B b=new B(1,"girish");
        try {
            FileOutputStream outputStream=new FileOutputStream("ab.ser");
            ObjectOutputStream outputStream1=new ObjectOutputStream(outputStream);
            outputStream.close();
            outputStream1.close();
            outputStream1.writeObject(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    b=null;
        try {
            FileInputStream inputStream=new FileInputStream("ab.ser");
            ObjectInputStream inputStream1=new ObjectInputStream(inputStream);
           b= (B) inputStream1.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println(" id is "+b.i);
        //System.out.println(" name is "+b);
    }
}
