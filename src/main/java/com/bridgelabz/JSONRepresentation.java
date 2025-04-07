package com.bridgelabz;

import java.lang.reflect.Field;

class Pen{
    private String brand;
    private String inkColor;
    private Float thickness;
    private Float price;
    Pen(String brand, String inkColor, Float thickness, Float price){
        this.brand = brand;
        this.inkColor = inkColor;
        this.thickness = thickness;
        this.price = price;
    }
}
public class JSONRepresentation {
    public static void main(String[] args) throws IllegalAccessException {
        Pen pen = new Pen("Pilot","Blue", 0.5F, 60.0F);
        Class<?> cls = pen.getClass();

        Field[] fields = cls.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            System.out.println(field.getName()+": " +field.get(pen));
        }
    }
}
