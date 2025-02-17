package com.reflection.advancelevel.customobjectmapper;
import java.lang.reflect.Field;
import java.util.Map;


class Book {
    String title;
    String author;
    @Override
    public String toString() {
        return "Book: " +
                "title=" + title +
                ", author=" + author;
    }
}
public class ObjectMapper {
    //method to map a Map<String, Object> to an object of type T using reflection
    public static <T> T toObject(Class<T> cls, Map<String, Object> properties) throws Exception {
        //create an instance of the class
        T obj = cls.newInstance();
        //get all fields of the class
        Field[] fields = cls.getDeclaredFields();
        //iterate over each field
        for (Field field : fields) {
            //get the field name
            String fieldName = field.getName();
            //check if the field is present in the properties map
            if (properties.containsKey(fieldName)) {
                // Get the value from the map and set it to the field
                Object value = properties.get(fieldName);
                field.set(obj, value);
            }
        }
        return obj;
    }
    public static void main(String[] args) {
        try {
            Map<String, Object> properties = Map.of(
                    "title", "400 Days",
                    "author", "Chetan Bhagat"
            );
            //convert the Map to object using toObject
            Book book = toObject(Book.class, properties);
            System.out.println(book);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
