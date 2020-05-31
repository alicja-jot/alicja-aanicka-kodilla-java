package com.kodilla.patterns3.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Italian pizza", description);
    }

    @Test
    public void testCheesePizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testCheesePizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Italian pizza with three cheese", description);
    }


    @Test
    public void testSalamiPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testSalamiPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Italian pizza with salami", description);
    }

    @Test
    public void testMushroomsPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), cost);
    }

    @Test
    public void testMushroomsPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Italian pizza with mushrooms", description);
    }

    @Test
    public void testMushroomsAndSalamiDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), cost);
    }

    @Test
    public void testMushroomsAndCheeseDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Italian pizza with mushrooms with three cheese", description);
    }

}
