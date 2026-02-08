package com.example.lib;

public class Product {

    String name;
    Float Price;
    Integer quantity;

    public Product (String name, Float price, Integer quantity) {

    this.name = name;
    this.Price = price;
    this.quantity = quantity;
    }

    public void identifyProductCategory() {
        System.out.println("I am a generic product");
    }

}
