package com.kodilla.spring.calculator;

import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculationsAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double result = calculator.add(5, 2);
        // Then
        Assert.assertEquals(7, result, 0.1);
    }
    @Test
    public void testCalculationsSub() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double result = calculator.sub(5, 2);
        // Then
        Assert.assertEquals(3, result, 0.1);
    }
    @Test
    public void testCalculationsMul() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double result = calculator.mul(5, 2);
        // Then
        Assert.assertEquals(10, result, 0.1);
    }
    @Test
    public void testCalculationsDiv() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double result = calculator.div(10, 2);
        // Then
        Assert.assertEquals(5, result, 0.1);
    }
}
