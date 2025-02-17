package com.reflection.intermediatelevel.retriveannotation;

public class RetriveAnnotation {
    public static void main(String[] args) {
        // Get the class type of Book
        Class<Book> cls = Book.class;
        //check if the annotation is present
        if (cls.isAnnotationPresent(Author.class)) {
            //get the annotation
            Author author = cls.getAnnotation(Author.class);

            //retrieve and print the name attribute from the annotation
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No annotation found.");
        }
    }
}
