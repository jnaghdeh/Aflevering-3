package com.example.lib;

public class SmartPhone extends Computer {

    Integer storage;

    public SmartPhone(String Brand, String Cpu, Integer Ram, Integer storage){
        super(Brand, Cpu, Ram);
        this.storage = storage;
    }

}
