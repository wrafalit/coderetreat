package com.coderetreat;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();

//        Step 1
        assertEquals(3,c.Add("1,2"));
        assertEquals(0,c.Add(""));
        assertEquals(2,c.Add("2"));
//        Step 2
        assertEquals(10,c.Add("0,1,2,3,4"));
        assertEquals(60,c.Add("10,20,30"));

//        Step 3
        assertEquals(10,c.Add("0,1\n2,3\n4"));
        assertEquals(60,c.Add("10,20\n30"));


    }
}