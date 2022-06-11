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
                int sum = 0;
                for (String part: parts) {
                    sum += Integer.parseInt(part);
                }
                return sum;
            } else {
            return Integer.parseInt(stringNumber);
        }
    }

}
