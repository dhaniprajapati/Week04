package com.shoppingcart;

import java.util.*;

class ShoppingCart {
    // hashmap to store product prices
    private Map<String, Double> productPrices = new HashMap<>();
    // linkedhashmap to maintain the order of items added to the cart
    private Map<String, Double> cartItems = new LinkedHashMap<>();
    // treemap to display items sorted by price
    private Map<String, Double> sortedItemsByPrice = new TreeMap<>((a, b) -> {
        return Double.compare(cartItems.get(a), cartItems.get(b));
    });
    // method to add a product to the cart
    public void addProductToCart(String productName, double price) {
        // add the product and its price to the hashmap (product prices)
        productPrices.put(productName, price);

        // add the product to the linkedhashmap (cart items) to maintain the insertion order
        cartItems.put(productName, price);

        // update the sorted items by price in the treemap
        refreshSortedItemsByPrice();
    }
    // method to remove a product from the cart
    public void removeProductFromCart(String productName) {
        // remove the product from both the hashmap and linkedhashmap
        productPrices.remove(productName);
        cartItems.remove(productName);

        // update the sorted items after removal
        refreshSortedItemsByPrice();
    }
    // method to refresh the treemap based on updated cart items
    private void refreshSortedItemsByPrice() {
        // clear the current TreeMap and add items sorted by price
        sortedItemsByPrice.clear();
        sortedItemsByPrice.putAll(cartItems);
    }
    // method to display the products in the cart (in order they were added)
    public void displayCart() {
        System.out.println("Shopping Cart (Items in the order added):");
        for (Map.Entry<String, Double> entry : cartItems.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: " + entry.getValue());
        }
    }
    // method to display the products sorted by price
    public void displaySortedCart() {
        System.out.println("Shopping Cart (Items sorted by price):");
        for (Map.Entry<String, Double> entry : sortedItemsByPrice.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: " + entry.getValue());
        }
    }
    // method to display all products and their prices
    public void displayAllProducts() {
        System.out.println("Available Products and Prices:");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        // display available products and prices
        shoppingCart.displayAllProducts();
        // add products to the cart
        shoppingCart.addProductToCart("Apple", 200);
        shoppingCart.addProductToCart("Banana", 20);
        shoppingCart.addProductToCart("Orange", 30);

        // display the cart with items in the order they were added
        shoppingCart.displayCart();
        // display the cart with items sorted by price
        shoppingCart.displaySortedCart();
        // remove a product from the cart
        shoppingCart.removeProductFromCart("Banana");
        shoppingCart.displayCart();
    }
}

