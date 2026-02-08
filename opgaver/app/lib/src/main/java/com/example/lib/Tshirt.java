package com.example.lib;

public class Tshirt extends Product {

    public Tshirt (String name, Float price, Integer quantity) {
       super(name,price,quantity);
    }

    @Override
    public void identifyProductCategory() {
        System.out.println("I am a T-Shirt");
    }
}
