package com.practice.junit.JunitDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 6);
        assertEquals(16, result, "Addition should be correct");
    }
}
