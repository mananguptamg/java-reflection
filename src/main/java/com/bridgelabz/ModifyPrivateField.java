package com.bridgelabz;

import java.lang.reflect.Field;

class Person{
    private String name = "Manan";
    private int age = 22;
}

public class ModifyPrivateField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person();
        Class<?> cls = person.getClass();

        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);

        System.out.println("Old value of age: " +field.get(person));
        field.set(person, 20);
        System.out.println("Updated value of age: " +field.get(person));
    }
}
