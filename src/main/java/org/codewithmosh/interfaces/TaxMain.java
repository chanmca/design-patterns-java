package org.codewithmosh.interfaces;

public class TaxMain {
    public static void main(String[] args) {
        var calculator2021 = getCalculator();
        calculator2021.calculateTax();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2021();
    }
}
