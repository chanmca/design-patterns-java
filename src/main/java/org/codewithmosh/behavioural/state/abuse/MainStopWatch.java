package org.codewithmosh.behavioural.state.abuse;

import org.codewithmosh.behavioural.state.abuse.StopWatch;

public class MainStopWatch {

    public static void main(String[] args) {
        var stopWatch = new UseStopWatch();
        stopWatch.setStopWatch(new NormalStopWatch());
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();

        System.out.println("*****************************************");
        System.out.println("           Abused Stop Watch");
        System.out.println("*****************************************");
        stopWatch.setStopWatch(new AbusedStopWatch());
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
    }
}
