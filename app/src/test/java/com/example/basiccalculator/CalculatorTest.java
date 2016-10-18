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

    @Test
    public void shouldReturn5OnSubtractionOf10With5() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void shouldReturn4OnSubtractionOf6With2() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(6, 2));

    }

    @Test
    public void shouldReturn8OnMultiplicationOf2With4() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    public void shouldReturn10OnMultiplicationOf5With2() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(5, 2));
    }
}
