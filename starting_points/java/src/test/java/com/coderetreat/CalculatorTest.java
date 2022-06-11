package com.coderetreat;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(2,c.Add("1,2"));
        assertEquals(0,c.Add(""));
        assertEquals(2,c.Add("2"));

    }
}