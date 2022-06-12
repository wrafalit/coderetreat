package com.coderetreat;

public class Calculator {


    public Calculator() {
    }

    public int Add (String stringNumber) {
        String delimiter = ",";

        if (stringNumber.length() == 0) {
            return 0;
        }


        //  Delimiters
        if (stringNumber.contains("//")) {
            String nDelimiter = stringNumber.substring(2,stringNumber.indexOf("\n"));
            stringNumber = stringNumber.substring(stringNumber.indexOf("\n")+1);
            stringNumber = stringNumber.replace(nDelimiter,",");
        }


        //  nBetween
        if (stringNumber.contains("\n")) {
            stringNumber = stringNumber.replace("\n",delimiter);
        }

        if (stringNumber.contains(delimiter)) {
            String[] parts = stringNumber.split(delimiter);
            int sum = 0;
            String negative = "";
            for (String part: parts) {
                if (Integer.parseInt(part)<0) {
                    negative += part +" ";
                    continue;
                }
                System.out.println(negative);
                if (negative.isEmpty()) {
                    sum += Integer.parseInt(part);
                }
            }
            if (!negative.isEmpty()){
                throw new IllegalArgumentException("negatives not allowed " +negative);
            }
            return sum;
        } else {
            return Integer.parseInt(stringNumber);
        }
    }
}
