package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    private Calculator calc;

    @Test
    public void testPlus() {
        calc = Calculator.instance.get();
        int result = calc.plus.apply(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        calc = Calculator.instance.get();
        int result = calc.multiply.apply(5, 10);
        assertEquals(50, result);
    }

    @Test
    public void testIsPositive() {
        calc = Calculator.instance.get();
        boolean result = calc.isPositive.test(10);
        assertTrue(result);
    }

    @Test
    public void testPow() {
        calc = Calculator.instance.get();
        int result = calc.pow.apply(5);
        assertEquals(25, result);
    }
}
