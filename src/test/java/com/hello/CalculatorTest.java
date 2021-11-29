package com.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void givenFourAndThreeAddResponseShouldBeSeven() {
        int sum = Calculator.add(3, 4);
        assertEquals(7, sum, "3+4 does not equal " + sum);
    }

    @Test
    void givenEightAndFourSubtractResponseShouldBeFour(){
        int difference = Calculator.subtract(8, 4);
        assertEquals(4, difference, "8-4 does not equal " + difference);
    }

    @Test
    void givenSixAndThreeMultiplyResponseShouldBeEightteen() {
        int product = Calculator.multiply(6, 3);
        assertEquals(18, product, "6 * 3 does not equal " + product);
    }

    @Test
    void givenTwentyAndFiveDivideResponseShouldBeFour() {
        int quotient = Calculator.divide(20, 5);
        assertEquals(4, quotient, "20 / 5 does not equal " + quotient);
    }
}