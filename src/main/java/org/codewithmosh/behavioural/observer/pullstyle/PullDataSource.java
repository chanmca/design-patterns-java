package org.codewithmosh.behavioural.observer.pullstyle;

public class PullDataSource extends Observable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
