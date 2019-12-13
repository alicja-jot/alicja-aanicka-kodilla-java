package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a = 0;
    private double h = 0;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    @Override
    public String getShapeName() {
    return "Trójkąt";
    }

    @Override
    public double getField() {
    return 0.5 * a * h;
    }
}
