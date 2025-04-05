package com.bridgelabz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Calculator{
    double a;
    double b;

    private double add(double a, double b){
        return a+b;
    }

    private double subtract(double a, double b){
        return a-b;
    }

    private double multiply(double a, double b){
        return a*b;
    }
}
public class AccessPrivateMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calculator calculator = new Calculator();
        Class<?> cls = calculator.getClass();

        Method method = cls.getDeclaredMethod("multiply", double.class, double.class);
        method.setAccessible(true);

        double result = (double) method.invoke(calculator, 5.0, 10.0);
        System.out.println("Multiplication result: "+result);

    }
}
