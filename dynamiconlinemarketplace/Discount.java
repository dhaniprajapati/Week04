package com.dynamiconlinemarketplace;

public class Discount <T extends Product> {

    public void addDiscount(T product, int rate) {
        double rateDiscount = rate / 100.0;
        double newPrice = product.getPrice() * (1 - rateDiscount);
        product.setPrice(newPrice);
        System.out.println("Discount applied: " + rate + "% " + ". New Price: " + product.getPrice());

    }
}
