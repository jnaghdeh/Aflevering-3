package com.example.lib;

public class JuniorVersion {
}
//Jeg indsætter alt i denne////////////////////////////////////

// Shape.java
public abstract class Shape {

    String color;
    boolean isTransparent;

    public Shape(String color, boolean isTransparent) {
        this.color = color;
        this.isTransparent = isTransparent;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}

//////////////////////////////////////////////


// Circle.java
public class Circle extends Shape {

    private double radius;

    public Circle(String color, boolean isTransparent, double radius) {
        super(color, isTransparent);
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

//////////////////////////////////////////////

// Triangle.java
public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, boolean isTransparent,
                    double sideA, double sideB, double sideC) {
        super(color, isTransparent);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
