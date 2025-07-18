package com.khaidevcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordValidatorTest {
    private final PasswordValidator underTest
            = new PasswordValidator();
    @Test
    void willFailIfPasswordIsNull() {
        //given
        String password = null;
        //when
        var actual = underTest.test(password);
        //then

        assertThat(actual).isFalse();
    }

    @Test
    void willFailIfPasswordIsEmpty() {
        //given
        String password = "";
        //when
        var actual = underTest.test(password);
        //then

        assertThat(actual).isFalse();
    }

    @Test
    void willFailIfPasswordHasEmptySpace() {
        //given
        String password = "  ";
        //when
        var actual = underTest.test(password);
        //then

        assertThat(actual).isFalse();
    }
}
