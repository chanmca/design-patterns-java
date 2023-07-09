package org.codewithmosh.behavioural.state.abuse;

public class UseStopWatch {
    private StopWatch currentStopWatch;

    public void click() {
        currentStopWatch.click();
    }

    public StopWatch getStopWatch() {
        return currentStopWatch;
    }

    public void setStopWatch(StopWatch currentStopWatch) {
        this.currentStopWatch = currentStopWatch;
    }
}