package com.coderetreat;

public class Calculator {


    public Calculator() {
    }

    public int Add (String stringNumber) {
        if (stringNumber.length() == 0) {
            return 0;
        }
        if (stringNumber.contains(",")) {
                String[] parts = stringNumber.split(",");
                return Integer.parseInt(parts[0]) + Integer.parseInt(parts[0]);
            } else {
            return Integer.parseInt(stringNumber);
        }
    }

}
