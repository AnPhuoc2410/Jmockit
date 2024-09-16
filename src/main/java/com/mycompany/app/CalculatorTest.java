package com.mycompany.app;

import mockit.Expectations;

import mockit.Mocked;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Mocked
    Calculator calculator;

    @Test
    public void testAdd() {
        new Expectations() {{
            calculator.add(2, 3); result = 5;
        }};

        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}