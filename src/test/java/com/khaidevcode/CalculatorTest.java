package com.khaidevcode;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
class CalculatorTest {

    Calculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new Calculator();
    }

    @AfterEach
    void tearDown() {

    }


    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @Test
    void canAdd2Numbers() {
        System.out.println("canAdd2Numbers");
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
    void can() {
        System.out.println("can");
        //given
        //when
        //then
    }
}