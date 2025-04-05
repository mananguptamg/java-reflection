package com.bridgelabz;

import java.lang.reflect.Field;

class Configuration{
    private static String API_KEY = "DBA23J4H37SJD474";
}
public class ModifyPrivateStaticField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Configuration configuration = new Configuration();
        Class<?> cls = configuration.getClass();

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Old value of api key is: " +field.get(configuration));
        field.set(configuration, "DSHDW832832SVKJ82SDN");
        System.out.println("Updated value of api key is: " +field.get(configuration));
    }
}
