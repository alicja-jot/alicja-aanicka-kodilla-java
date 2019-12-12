package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        int temporaryValue = 0;

        for (int i = 0; i < numbers.size(); i++) {
            temporaryValue = numbers.get(i);
            if (temporaryValue % 2 == 0) {
                oddNumbers.add(temporaryValue);
            }
        }
        return oddNumbers;
    }


}
