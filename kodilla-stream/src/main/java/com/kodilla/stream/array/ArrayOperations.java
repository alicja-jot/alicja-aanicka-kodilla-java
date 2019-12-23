package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, 20)
                .forEach(index -> System.out.println(numbers[index]));

        OptionalDouble average = IntStream.range(0, 20)
                .map(i -> numbers[i])
                .average();

        return average.getAsDouble();
    }
}
