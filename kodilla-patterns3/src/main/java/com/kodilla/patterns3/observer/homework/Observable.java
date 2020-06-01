package com.kodilla.patterns3.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
