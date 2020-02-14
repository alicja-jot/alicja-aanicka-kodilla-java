package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";

    public final Task makeTask (final String taskClass){
        switch (taskClass){
            case DRIVING_TASK:
                return new DrivingTask("Trip first", "Krakow", "by car");
            case SHOPPING_TASK:
                return new ShoppingTask("First shopping", "skirts", 30);
            case PAINTING_TASK:
                return new PaintingTask("First painting", "blue", "the sea");
            default:
                return null;
        }
    }
}
