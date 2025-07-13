package com.khaidevcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
    private final Calculator underTest = new Calculator();

    @Test
    void canAddNumbers() {
        // 1 - given
        var number1 = 3;
        var number2 = 3;

        // 2 - when
        var actual = underTest.add(number1, number2);

        // 3 - then
//        assertEquals(6, result);
        var expected = 6;
        assertThat(actual).isEqualTo(expected);

    }


    @Test
    void name() {
        //given
        //when
        //then
    }
}
