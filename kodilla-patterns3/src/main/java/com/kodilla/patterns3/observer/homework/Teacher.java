package com.kodilla.patterns3.observer.homework;

public class Teacher implements Observer {

    private final String userName;
    private int updateCount;

    public Teacher(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(userName + " : New task in queue " + taskQueue.getQueue().size() + "tasks.");
        updateCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
