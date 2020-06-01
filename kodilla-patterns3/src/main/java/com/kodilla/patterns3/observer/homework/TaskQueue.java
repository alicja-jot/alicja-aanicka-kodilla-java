package com.kodilla.patterns3.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskQueue implements Observable {

    private final List<Observer> observers;
    private final String name;
    private Queue<String> queue;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        this.name = name;
        queue = new ArrayDeque<>();
    }

    public void sendTaskToTeacher(String taskName) {
        queue.add(taskName);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getName() {
        return name;
    }

    public Queue<String> getQueue() {
        return queue;
    }
}
