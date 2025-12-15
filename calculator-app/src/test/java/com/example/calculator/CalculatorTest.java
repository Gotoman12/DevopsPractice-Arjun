package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        assertEquals(5.0, c.add(2,3), 0.001);
    }

    @Test
    public void testDivide(){
        Calculator c = new Calculator();
        assertEquals(2.0, c.divide(6,3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        Calculator c = new Calculator();
        c.divide(5,0);
    }
}
