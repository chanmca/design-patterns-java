package org.codewithmosh.behavioural.observer;


import org.codewithmosh.behavioural.observer.pullstyle.PullChart;
import org.codewithmosh.behavioural.observer.pullstyle.PullDataSource;
import org.codewithmosh.behavioural.observer.pullstyle.PullSpreadSheet;
import org.codewithmosh.behavioural.observer.pushstyle.Chart;
import org.codewithmosh.behavioural.observer.pushstyle.DataSource;
import org.codewithmosh.behavioural.observer.pushstyle.SpreadSheet;

public class ObserverMain {
    public static void main(String[] args) {

        // push style observer
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);
        dataSource.setValue(1);

        // pull style observer
        var dataSourcePull = new PullDataSource();
        var sheet3 = new PullSpreadSheet(dataSourcePull);
        var sheet4 = new PullSpreadSheet(dataSourcePull);
        var chart1 = new PullChart(dataSourcePull);

        dataSourcePull.addObserver(sheet3);
        dataSourcePull.addObserver(sheet4);
        dataSourcePull.addObserver(chart1);
        dataSourcePull.setValue(19);
    }
}
