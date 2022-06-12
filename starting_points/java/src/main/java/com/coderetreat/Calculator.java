package com.coderetreat;

public class Calculator {


    public Calculator() {
    }

    public int Add (String stringNumber) {
        String delimiter = ",";

        if (stringNumber.length() == 0) {
            return 0;
        }

        stringNumber = Delimiters (stringNumber);
        stringNumber = nBetween (stringNumber, delimiter);

        if (stringNumber.contains(delimiter)) {
                String[] parts = stringNumber.split(delimiter);
                int sum = 0;
                for (String part: parts) {
                    sum += Integer.parseInt(part);
                }
                return sum;
            } else {
            return Integer.parseInt(stringNumber);
        }
    }

    private String nBetween(String str, String delimiter) {
        if (str.contains("\n")) {
            str = str.replace("\n",delimiter);
        }
        return  str;
    }

    private String Delimiters(String str) {
        if (str.contains("//")) {
            String delimiter = str.substring(2,str.indexOf("\n"));
            str = str.substring(str.indexOf("\n")+1);
            str = str.replace(delimiter,",");
        }
        return str;
    }

}
