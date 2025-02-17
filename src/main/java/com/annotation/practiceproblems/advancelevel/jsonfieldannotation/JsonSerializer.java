package com.annotation.practiceproblems.advancelevel.jsonfieldannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder jsonString = new StringBuilder("{");
        // Get all fields of the object
        Field[] fields = obj.getClass().getDeclaredFields();
        Map<String, String> jsonFields = new HashMap<>();
        for (Field field : fields) {
            // Check if field has @JsonField annotation
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name();
                // Make the field accessible
                field.setAccessible(true);
                try {
                    // Get the field value and put it into a map
                    Object value = field.get(obj);
                    jsonFields.put(jsonKey, String.valueOf(value));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        // Convert the map into a JSON string
        for (Map.Entry<String, String> entry : jsonFields.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }
        // Remove the last comma and space
        if (jsonString.length() > 1) {
            jsonString.delete(jsonString.length() - 2, jsonString.length());
        }
        jsonString.append("}");
        return jsonString.toString();
    }
    public static void main(String[] args) {
        User user = new User("john_doe", "John Doe", "john.doe@example.com");
        String json = toJson(user);
        System.out.println(json);
    }
}
