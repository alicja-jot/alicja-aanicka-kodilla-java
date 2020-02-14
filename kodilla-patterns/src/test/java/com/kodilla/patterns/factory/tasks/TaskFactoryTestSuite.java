package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    private TaskFactory factory = new TaskFactory();

    @Test
    public void testFactoryCreatesDrivingTask() {
        // When
        Task task = factory.makeTask(TaskFactory.DRIVING_TASK);
        // Then
        Assert.assertEquals(task.getTaskName(), "Trip first");
    }

    @Test
    public void testFactoryCreatesShoppingTask() {
        // When
        Task task = factory.makeTask(TaskFactory.SHOPPING_TASK);
        // Then
        Assert.assertEquals(task.getTaskName(), "First shopping");
    }

    @Test
    public void testFactoryCreatesPaintingTask() {
        // When
        Task task = factory.makeTask(TaskFactory.PAINTING_TASK);
        // Then
        Assert.assertEquals(task.getTaskName(), "First painting");
    }

    @Test
    public void testFactoryChecksExecutionOfDrivingTask() {
        // When
        Task task = factory.makeTask(TaskFactory.DRIVING_TASK);
        // Then
        Assert.assertFalse(task.isTaskExecuted());
    }

    @Test
    public void testFactoryChecksExecutionOfShoppingTask() {
        // When
        Task task = factory.makeTask(TaskFactory.SHOPPING_TASK);
        // Then
        Assert.assertFalse(task.isTaskExecuted());
    }

    @Test
    public void testFactoryChecksExecutionOfPaintingTask() {
        // When
        Task task = factory.makeTask(TaskFactory.PAINTING_TASK);
        // Then
        Assert.assertFalse(task.isTaskExecuted());
    }

    @Test
    public void testFactoryCreatesNull() {
        // When
        Task task = factory.makeTask("invalid input");
        // Then
        Assert.assertNull(task);
    }
}
