package com.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void givenFourAndThreeAddResponseShouldBeSeven() {
        int result = Calculator.add(3, 4);
        assertEquals(7, result, "3+4 does not equal " + result);
    }
}