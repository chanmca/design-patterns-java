package org.codewithmosh.behavioural.observer.pullstyle;

import java.util.ArrayList;
import java.util.List;

// in gof this is called subject
public class Observable {

    private final List<PullObserver> observers = new ArrayList<>();

    public void addObserver(PullObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PullObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (var observer : observers)
            observer.update();
    }
}
