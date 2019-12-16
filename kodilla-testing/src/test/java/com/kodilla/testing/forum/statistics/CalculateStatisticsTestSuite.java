package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private List<String> usersList = new LinkedList<>();

    public CalculateStatisticsTestSuite() {
        usersList.add("kafka");
    }

    @Test
    public void  testForZeroPost() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateStatistics.getNumberOfPosts());
    }

    @Test
    public void testForOneThousand() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts());
    }

    @Test
    public void testZeroComments() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateStatistics.getNumberOfComments());
    }

    @Test
    public void testNumberOfCommentsIsSmallerThenNumberOfNumberOfPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(3);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertTrue(calculateStatistics.getNumberOfComments() < calculateStatistics.getNumberOfPosts());
    }

    @Test
    public void testNumberOfCommentsIsBiggerThenNumberOfPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertFalse(calculateStatistics.getNumberOfComments() < calculateStatistics.getNumberOfPosts());
    }

    @Test
    public void testZeroUsers() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> zeroUserList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(zeroUserList);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateStatistics.getNumberOfUsers());
    }

    @Test
    public void testHundredUsers() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> hundredUsersList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            hundredUsersList.add("kafka");
        }

        when(statisticsMock.usersNames()).thenReturn(hundredUsersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, calculateStatistics.getNumberOfUsers());
    }

}
