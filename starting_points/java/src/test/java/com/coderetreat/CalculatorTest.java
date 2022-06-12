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

//        Step 4
        assertEquals(3,c.Add("//;\n1;2"));
        assertEquals(70,c.Add("//;\n10;20\n30,10"));

    }

//         Step 5
    @Test(expected = IllegalArgumentException.class)
    public void testAdd5()  {
        Calculator c = new Calculator();
        c.Add("//;\n10;-20\n30,10");
    }

//         Step 6
    @Test
    public void testAdd6()  {
        Calculator c = new Calculator();
        assertEquals(70,c.Add("//;\n10;20\n30,10"));
        assertEquals(50,c.Add("//;\n10;2000\n30,10"));
    }
}