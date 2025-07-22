package com.khaidevcode.debuggingexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceTest {

    private final OrderService underTest = new OrderService();

    @Test
    void shouldCalculateTotalForVipCustomer() {
        // given
        var itemPrice = 50.0;
        var quantity = 3;
        var vipCustomer = true;

        // when
        double total = underTest.calculateTotal(itemPrice, quantity, vipCustomer);

        // then
        var expected = 153.0;
        assertThat(total).isEqualTo(expected);
    }
}