package org.codewithmosh.behavioural.observer.pushstyle;

import java.util.ArrayList;
import java.util.List;

// in gof this is called subject
public class Observable {

    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int value) {
        for (var observer : observers)
            observer.update(value);
    }
}
