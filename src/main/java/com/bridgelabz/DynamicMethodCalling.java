package com.bridgelabz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodCalling {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation to perform (add, subtract, multiply) ");
        String operation = scanner.nextLine();
        Calculator calculator = new Calculator();
        Class<?> cls = calculator.getClass();

        Method method = cls.getDeclaredMethod(operation, double.class, double.class);
        method.setAccessible(true);

        double result = (double) method.invoke(calculator, 5.0, 10.0);
        System.out.println("Result of "+operation+ " is "+result);

    }
}
