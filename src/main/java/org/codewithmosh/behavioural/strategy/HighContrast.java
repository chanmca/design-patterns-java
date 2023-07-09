package org.codewithmosh.behavioural.strategy;

public class HighContrast implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying high contrast filter");
    }
}
