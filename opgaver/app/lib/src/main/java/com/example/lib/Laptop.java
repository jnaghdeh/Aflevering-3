package com.example.lib;

public class Laptop extends Computer {

    Integer batteryLife;

    public Laptop (String Brand, String Cpu, Integer Ram, Integer batteryLife){
super(Brand, Cpu, Ram);
this.batteryLife = batteryLife;
            }
}
