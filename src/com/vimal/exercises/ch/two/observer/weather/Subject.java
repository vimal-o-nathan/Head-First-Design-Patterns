package com.vimal.exercises.ch.two.observer.weather;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
