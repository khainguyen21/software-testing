package com.khaidevcode.ShippingCostCalculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ShippingCostCalculatorTest {
    private final ShippingCostCalculator underTest = new ShippingCostCalculator();

    @Test
    void shouldChargeFiveEurosForSmallPackage() {
        assertThat(underTest.calculate(0.5, "Local", false)).isEqualTo(5.00);
    }

    @Test
    void shouldChargeTenEurosForLocalStandardShipping() {
        assertThat(underTest.calculate(2.0, "Local", false)).isEqualTo(10.00);
    }

    @Test
    void shouldChargeTwentyEurosForInternationalShipping() {
        assertThat(underTest.calculate(2.0, "International", false)).isEqualTo(20.00);
    }

    @Test
    void shouldAddExpressFee() {
        assertThat(underTest.calculate(0.5, "Local", true)).isEqualTo(20.00);
    }
}