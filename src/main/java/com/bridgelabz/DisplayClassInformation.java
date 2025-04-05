package com.bridgelabz;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DisplayClassInformation {

    public static void displayMethods(Class<?>cls){
        Method [] methods = cls.getDeclaredMethods();
        System.out.println("Methods for " +cls.getName());

        for(Method method : methods){
            System.out.println(method);
        }
        System.out.println("------------------------------------------");
    }

    public static void displayFields(Class<?>cls){
        Field[] fields = cls.getDeclaredFields();
        System.out.println("Fields for " +cls.getName());

        for(Field field : fields){
            System.out.println(field);
        }
        System.out.println("------------------------------------------");
    }

    public static void displayConstructors(Class<?>cls){
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        System.out.println("Constructors of " +cls.getName());

        for(Constructor<?> constructor : constructors){
            System.out.println(constructor);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter the class name ");
        String className = scanner.nextLine();

        try {
            Class<?> cls = Class.forName(className);

            System.out.println("Class" +cls.getName());
            displayMethods(cls);
            displayFields(cls);
            displayConstructors(cls);

        }catch (ClassNotFoundException e){
            System.out.println("Class not found exception");
        }
    }
}
