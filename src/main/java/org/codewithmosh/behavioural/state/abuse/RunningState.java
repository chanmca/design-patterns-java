package org.codewithmosh.behavioural.state.abuse;

public class RunningState implements State {
    private AbusedStopWatch stopWatch;

    public RunningState(AbusedStopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new StoppedState(stopWatch));
        System.out.println("Stopped");
    }
}
