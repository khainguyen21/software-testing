package com.khaidevcode;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * Unit test for a simple App.
 */
public class AppTest {

    // Define this is a test method
    @Test
    // Over the name of the test
    @DisplayName("My first test :)")
    // Disable the test method
    @Disabled
    void myFirstTest() {

    }

    // Only run if the Operating System is Mac
    @EnabledOnOs(OS.MAC)

    // Repeat how many times would you like to run this test
    @RepeatedTest(10)
    @Tag("slow")
    void mySecondTest() {

    }
}
