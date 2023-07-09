package org.codewithmosh.behavioural.observer.pushstyle;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart notified and updated: " + value);
    }
}
