package com.annotation.useoverride;

public class Dog extends Animal
{
    Dog(String name)
    {
        super(name);//call superclass constructor
    }
    //overriding sound from superclass
    @Override
    public void makeSound()
    {
        System.out.print("Barks.");
    }
}
