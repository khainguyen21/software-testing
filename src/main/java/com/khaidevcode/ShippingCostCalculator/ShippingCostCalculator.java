package com.khaidevcode.ShippingCostCalculator;

public class ShippingCostCalculator {

    public static final double MIN_WEIGHT_THRESHOLD = 1.00;

    public double calculate(double weightKg, String region, boolean express) {
        // TODO: implement using TDD

        double base = 0;

        if (weightKg <= 1.00) {
            base = 5.00;
        } else if (weightKg < 5.00) {
            if (region.equalsIgnoreCase("Local")) {
                base = 10.00;
            } else if (region.equalsIgnoreCase("International")) {
                base = 20.00;
            }
        }

        if (express) {
            base += 20.00;
        }

        return base;
    }
}
