package com.khaidevcode;

public class Calculator {
    public <T extends Number> int add(T a, T b) {
        return a.intValue() + b.intValue();
    }
}
