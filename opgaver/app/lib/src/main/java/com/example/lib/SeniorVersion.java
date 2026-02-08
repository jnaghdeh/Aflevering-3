package com.example.lib;

public class SeniorVersion {
}

//Jeg indsætter alt i denne///////////////////////////////////////

// Shape.java
public abstract class Shape {

    private final String color;
    private final boolean transparent;

    protected Shape(String color, boolean transparent) {
        this.color = color;
        this.transparent = transparent;
    }

    public String getColor() {
        return color;
    }

    public boolean isTransparent() {
        return transparent;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}


////////////////////////////////////////////////////

// Circle.java
public final class Circle extends Shape {

    private final double radius;

    public Circle(String color, boolean transparent, double radius) {
        super(color, transparent);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


////////////////////////////////////////////////////

// Triangle.java
public final class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(String color, boolean transparent,
                    double a, double b, double c) {
        super(color, transparent);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
