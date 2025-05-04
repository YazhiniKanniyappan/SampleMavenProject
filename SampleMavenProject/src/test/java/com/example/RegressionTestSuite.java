package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegressionTestSuite {

    @Test
    public void testAddition() {
        int sum = 2 + 3;
        assertEquals(5, sum);  // Check if 2 + 3 equals 5
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result);  // Check if 5 - 3 equals 2
    }

    @Test
    public void testMultiplication() {
        int product = 3 * 4;
        assertEquals(12, product);  // Check if 3 * 4 equals 12
    }

    @Test
    public void testDivision() {
        int quotient = 8 / 2;
        assertEquals(4, quotient);  // Check if 8 / 2 equals 4
    }
}
