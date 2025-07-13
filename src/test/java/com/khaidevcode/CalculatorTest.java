package com.khaidevcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void canAddNumbers() {
        var calculator = new Calculator();
        var result = calculator.add(3, 3);
        assertEquals(6, result);
    }
}
