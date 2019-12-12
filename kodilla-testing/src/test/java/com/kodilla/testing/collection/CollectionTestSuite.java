package com.kodilla.testing.collection;

import com.kodilla.testing.collection.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();

        //When
        ArrayList<Integer> oddList = oddExterminator.exterminate(numbers);

        //Then
        Assert.assertTrue(oddList.isEmpty());

    }


    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(11);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        // When
        ArrayList<Integer> odd = oddExterminator.exterminate(numbers);
        // Then
        Assert.assertTrue(odd.size() == 2);
        Assert.assertEquals(odd, expected);
    }
}
