package com.bridgelabz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CalculatorService{
    private int num1;
    private int num2;

    public CalculatorService() {
    }

    public int sum(int num1, int num2){
        return num1+num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }
}
public class MethodExecutionTime {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        CalculatorService calculator = new CalculatorService();
        Class<?> cls = calculator.getClass();

        Method[] methods = cls.getDeclaredMethods();

        for(Method method : methods){
            method.setAccessible(true);
            long startTime = System.nanoTime();
            method.invoke(calculator, 3,2);
            long endTime = System.nanoTime();
            long totalTime = (endTime-startTime)/1_000_000;
            System.out.println("Execution time of " +method.getName()+ " method is "+totalTime+ " ms");
        }
    }
}
