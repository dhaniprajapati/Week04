package com.annotation.useoverride;

public class Main
{
    public static void main(String[] args)
    {
        //creating objects of dog
        Dog dog= new Dog("leo");
        //calling overridden sound method
        dog.makeSound();
    }
}
