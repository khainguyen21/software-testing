package com.khaidevcode.debuggingexercise;

public class ShippingService {
    public double getShippingCost(double subtotal) {
        return subtotal < 50 ? 10.0 : 0.0;
    }
}
