package com.reflection.advancelevel.dependancyinjection;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();
    //instance of a class to be injected later
    public void register(Class<?> clazz, Object instance) {
        instances.put(clazz, instance);
    }
    //Inject dependencies into fields
    public void injectDependencies(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = instances.get(fieldType);
                if (dependency == null) {
                    throw new RuntimeException("No registered instance found for: " + fieldType.getName());
                }
                field.setAccessible(true);
                try {
                    field.set(obj, dependency);
                } catch (Exception e) {
                    System.out.println("Error: "+ e.getMessage());
                }
            }
        }
    }
}
