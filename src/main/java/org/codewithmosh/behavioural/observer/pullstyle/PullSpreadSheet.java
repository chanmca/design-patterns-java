package org.codewithmosh.behavioural.observer.pullstyle;

public class PullSpreadSheet implements PullObserver {
    private final PullDataSource dataSource;

    public PullSpreadSheet(PullDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet notified and updated :" + dataSource.getValue());
    }
}
