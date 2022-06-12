package com.coderetreat;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        int x = c.Add("1,2,3,4\n5");
        int y = c.Add("//;\n1;2");
        System.out.println(y);

    }
}
