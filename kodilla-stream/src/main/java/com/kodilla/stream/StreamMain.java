package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


    PoemBeautifier poemBeautifier = new PoemBeautifier();
    poemBeautifier.beautify("Daj ać ja pobruszę, a Ty poczywaj!", textToDecorate -> textToDecorate.toUpperCase());
    poemBeautifier.beautify("Veni, vidi, vici!", textToDecorate -> "ABC " + textToDecorate + " ABC");
    poemBeautifier.beautify("Prawo moralne we mnie!", textToDecorate -> textToDecorate.toLowerCase());
    poemBeautifier.beautify("Wszystko płynie.", textToDecorate -> textToDecorate.substring(9));

    }





}
