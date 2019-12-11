package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String [] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator();
        int result1 = calculator.add(10,4);
        if (result1 == (14)){
            System.out.println("Add test is ok.");
        } else {
            System.out.println("Add test error.");
        }
        int result2 = calculator.subtract(50,10);
        if (result2 == 40){
            System.out.println("Subtract test is ok.");
        } else {
            System.out.println("Subtract test error.");
        }


    }
}
