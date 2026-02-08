package com.example.lib;

public class Book extends Product {

    public Book (String name, Float price, Integer quantity) {
        super(name,price,quantity);
    }

    @Override
    public void identifyProductCategory() {
        System.out.println("I am a Book");
    }
}
