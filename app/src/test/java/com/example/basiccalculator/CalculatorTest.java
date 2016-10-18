package com.example.basiccalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void shouldReturn4OnAdding3to1() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(3, 1));
    }

    @Test
    public void shouldReturn10OnAdding5to5() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }


}
