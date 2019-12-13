package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeCollection = new ArrayList<>();

    public ArrayList<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
        System.out.println("Dodano " + shape.getShapeName() + " do kolekcji.");
    }

    public void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
        System.out.println("Usunięto " + shape.getShapeName() + " z kolekcji.");
    }

    public Shape getFigure(int n) {
        return shapeCollection.get(n);
    }

    public ArrayList<Shape> showFigures() {
        ArrayList<Shape> ourShapes = new ArrayList<>();
        System.out.println("Oto figury znajdujące się w zbiorze: ");
        for (int i = 0; i < shapeCollection.size(); i++) {
            ourShapes.add(shapeCollection.get(i));
            System.out.println(shapeCollection.get(i).getShapeName());
        }
        return ourShapes;
    }


}
