package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a = 0;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return "Kwadrat";
    }

    @Override
    public double getField() {
        return a * a;
    }
}
