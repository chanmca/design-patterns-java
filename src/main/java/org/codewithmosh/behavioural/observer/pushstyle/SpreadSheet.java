package org.codewithmosh.behavioural.observer.pushstyle;

public class SpreadSheet implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Spreadsheet notified and updated: " + value);
    }
}
