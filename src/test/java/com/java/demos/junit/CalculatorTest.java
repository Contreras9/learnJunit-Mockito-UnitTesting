package com.java.demos.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("Oops!");
        });
    }

    @Test
    public void testAdd2() {
        fail("Failing the test!");
    }

    @Test
    public void testAdd3() {
        try {
            fail("Failing the test!");
        } catch (RuntimeException e) {
            System.out.println("Failed!");
        }
    }

    @Test
    public void testAdd4() {
        try {
            fail("Failing the test!");
        } catch (Exception e) {
            System.out.println("Failed!");
        }
    }

    @Test
    public void testAddPositiveNumbers() {
        // arrange
        int num1 = 10;
        int num2 = 20;

        // act
        int result = calculator.add(num1, num2);

        // assert
        assertEquals(30, result);
    }

    @Test
    public void testAddZeroToPositive() {
        // arrange
        int num1 = 10;
        int num2 = 0;

        // act
        int result = calculator.add(num1, num2);

        // assert
        assertEquals(10, result);
    }
}
