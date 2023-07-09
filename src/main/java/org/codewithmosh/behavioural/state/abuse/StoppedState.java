package org.codewithmosh.behavioural.state.abuse;

public class StoppedState implements State {

    private AbusedStopWatch stopWatch;

    public StoppedState(AbusedStopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new RunningState(stopWatch));
        System.out.println("Running");
    }
}
