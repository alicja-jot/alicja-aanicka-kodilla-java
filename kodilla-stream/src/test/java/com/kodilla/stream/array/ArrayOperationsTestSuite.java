package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = {
                5, 3, 7, 3, 8, 6, 8, 4, 5, 2, 3, 7, 3, 8, 6, 8, 4, 5, 2, 7
        };

        // When
        double average = ArrayOperations.getAverage(numbers);

        // Then
        assertEquals(5.2, average, 0.0001);
    }
}
