package com.reflection.intermediatelevel.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Configuration {
    private static String API_KEY = "57ytg75ygf";
    public static void main(String[] args) throws Exception {
        //access the Configuration class
        Class<?> configClass = Configuration.class;
        //get the private static field API_KEY
        Field field = configClass.getDeclaredField("API_KEY");
        //make the field accessible
        field.setAccessible(true);
        //modify the value of the static field
        field.set(null, "5ygryey785tgr");
        System.out.println("Modified API_KEY: " + API_KEY);
    }
}
