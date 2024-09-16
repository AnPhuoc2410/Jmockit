package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitCalTester {
    @Test
    public void testAddPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, -3);
        assertEquals(-1, result);
    }

    @Test
    public void testAddZero() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 0);
        assertEquals(0, result);
    }
}
