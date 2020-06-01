package com.kodilla.patterns3.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue taskQueue1 = new TaskQueueModulFirst("first");
        TaskQueue taskQueue2 = new TaskQueueModuleSecond("second");

        Teacher teacher1 = new Teacher("Jan Kowalski");
        Teacher teacher2 = new Teacher("Janusz Nowak");

        taskQueue1.registerObserver(teacher1);
        taskQueue2.registerObserver(teacher2);

        //When
        taskQueue1.sendTaskToTeacher("xxx");
        taskQueue1.sendTaskToTeacher("bbb");

        taskQueue2.sendTaskToTeacher("ccc");

        //Then
        assertEquals(2, teacher1.getUpdateCount());
        assertEquals(1, teacher2.getUpdateCount());

    }

}
