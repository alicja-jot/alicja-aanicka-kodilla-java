package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class BoardTestSuite {
    @Test
    public void testTaskAddInProgress() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        board.getInProgressList().getTasks().add("In progress task");

        // Then
        TaskList inProgressList = context.getBean("inProgressList", TaskList.class);
        assertEquals(1, inProgressList.getTasks().size());
    }

    @Test
    public void testTaskAddToDo() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        board.getToDoList().getTasks().add("To do task");

        // Then
        assertEquals(1, board.getToDoList().getTasks().size());

    }

    @Test
    public void testTaskAddDone() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        board.getDoneList().getTasks().add("Done task");

        // Then
        assertEquals(1, board.getDoneList().getTasks().size());
    }
}
