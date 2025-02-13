package com.dynamiconlinemarketplace;

public class Product {
    private String name;
    private double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return (getClass().getSimpleName()+" : "+name+"\n"+getClass().getSimpleName()+" price : "+price);
    }
}
