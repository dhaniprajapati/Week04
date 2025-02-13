package com.dynamiconlinemarketplace;
public class Main {
    public static void main(String[] args) {
        // Create objects of different product categories
        Clothing clothing1 = new Clothing("Roadster", 2500);
        Clothing clothing2 = new Clothing("ZARA", 50000);
        Book book1 = new Book("Twisted Series", 990);
        Book book2 = new Book("Panchtantra", 299);
        Gadgets gadgets = new Gadgets("Phone", 13000);

        // Create Discount to apply discounts to products
        Discount<Product> discount = new Discount<>();
        discount.addDiscount(clothing1, 20);
        discount.addDiscount(clothing2, 35);
        discount.addDiscount(book1, 30);
        discount.addDiscount(book2, 10);
        discount.addDiscount(gadgets, 10);

        // Create Storage instances for different product categories
        Storage<Clothing> clothingStorage = new Storage<>();
        Storage<Book> bookStorage = new Storage<>();
        Storage<Gadgets> gadgetsStorage = new Storage<>();

        // Add items to their respective storages
        clothingStorage.addItem(clothing2);
        clothingStorage.addItem(clothing1);
        bookStorage.addItem(book1);
        bookStorage.addItem(book2);
        gadgetsStorage.addItem(gadgets);

        // Print the lists of items in each storage
        System.out.println(clothingStorage.getList());
        System.out.println(bookStorage.getList());
        System.out.println(gadgetsStorage.getList());
    }
}
