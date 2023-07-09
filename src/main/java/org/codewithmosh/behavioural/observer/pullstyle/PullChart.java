package org.codewithmosh.behavioural.observer.pullstyle;

public class PullChart implements PullObserver {

    private final PullDataSource dataSource;

    public PullChart(PullDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart notified and updated: " + dataSource.getValue());
    }
}
