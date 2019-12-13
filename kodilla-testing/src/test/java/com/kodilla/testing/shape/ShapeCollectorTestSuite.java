package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import com.kodilla.testing.shape.*;

import java.util.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {
    static int counter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        counter++;
        System.out.println("Preparing to execute test #" + counter);
    }

    @Test
    public void testAddFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape expected = new Circle(5);

        // When
        shapeCollector.addFigure(expected);

        // Then
        List<Shape> results = shapeCollector.showFigures();
        Shape result = results.get(0);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shapeToRemove = new Square(2);
        shapeCollector.addFigure(shapeToRemove);
        //When
        shapeCollector.removeFigure(shapeToRemove);
        List<Shape> result = shapeCollector.showFigures();
        //Then
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle firstFigure = new Circle(3);
        Triangle secondFigure = new Triangle(2, 4);
        shapeCollector.addFigure(firstFigure);
        shapeCollector.addFigure(secondFigure);
        //When
        Shape firstResult = shapeCollector.getFigure(0);
        Shape secondResult = shapeCollector.getFigure(1);
        //Then
        assertEquals(firstFigure, firstResult);
        assertEquals(secondFigure, secondResult);

    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle shape = new Circle(1);
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(new Triangle(2, 4));
        //When
        ArrayList<Shape> list = shapeCollector.showFigures();
        // Then
        assertTrue(list.size() == 2);
        assertTrue(list.contains(shape));
    }

    @Test
    public void testGetFieldCircle() {
        //Given
        Circle circle = new Circle(5);
        //When
        double result = circle.getField();
        //Then
        Assert.assertEquals(78.5, result, 0.1);
    }

    @Test
    public void getTestGetFieldSquare() {
        //Given
        Square square = new Square(3);
        //When
        double result = square.getField();
        //Then
        Assert.assertEquals(9, result, 0.1);
    }

    @Test
    public void getTestGetFieldTriangle(){
        //Given
    Triangle triangle = new Triangle(10,5);
        //When
    double result = triangle.getField();
        //Then
    Assert.assertEquals(25, result, 0.1);
    }
}
