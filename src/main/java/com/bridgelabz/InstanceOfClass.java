package com.bridgelabz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student{
    private String name;
    private int age;

    Student(){
        this.name = "Manan";
        this.age = 22;
    }
    public void print(){
        System.out.println("Name of student is: "+name+ " and age is: " +age);
    }
}
public class InstanceOfClass {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;

        Constructor<?> constructor = cls.getDeclaredConstructor();
        Student s1 = (Student) constructor.newInstance();
        s1.print();

//        Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
//        Student s1=(Student) constructor.newInstance("Abc", 21);
//        s1.print();
    }
}
