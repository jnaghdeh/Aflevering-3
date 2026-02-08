package com.example.lib;

public class Shoe extends Product {

    public Shoe (String name, Float price, Integer quantity){
        super(name,price,quantity);
    }

    @Override
    public void identifyProductCategory() {
        System.out.println("I am a shoe");
    }
}
