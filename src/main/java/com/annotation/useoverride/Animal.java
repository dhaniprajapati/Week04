package com.annotation.useoverride;

public class Animal
{
    private String name;
    public Animal(String name)
    {
        this.name=name;
        System.out.println("Pet name: "+name);
        System.out.println( "Sound: ");
    }
    //method to get sound of animal
    public void makeSound()
    {
        System.out.print("Animal makes sound");
    }
}
