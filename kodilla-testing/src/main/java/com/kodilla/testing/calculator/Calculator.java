package com.kodilla.testing.calculator;

public class Calculator {
    public int a = 0;
    public int b = 0;
    int sum = 0;
    int result = 0;

    public int add (int a, int b){
        sum = a + b;
        return sum;
    }

    public int subtract (int a, int b){
        result = a - b;
        return result;
    }

}
