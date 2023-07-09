package org.codewithmosh.behavioural.state.abuse;

public class NormalStopWatch implements StopWatch {

    private boolean isRunning;

    @Override
    public void click() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Stopped");
        } else {
            isRunning = true;
            System.out.println("Running");
        }
    }
}
