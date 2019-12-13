package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r = 0.0;
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String getShapeName() {
        return "Koło";
    }

    @Override
    public double getField() {
        return 3.14 * (r*r);
    }
}
