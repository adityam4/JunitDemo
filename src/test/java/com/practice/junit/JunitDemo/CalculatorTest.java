package com.practice.junit.JunitDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 4);
        assertEquals(6, result, "Addition should be correct");
    }
}
