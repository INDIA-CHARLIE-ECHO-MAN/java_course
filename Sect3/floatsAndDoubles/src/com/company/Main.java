package com.company;

public class Main {

    public static void main(String[] args) {
	    float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        System.out.println("min float is:" + floatMin);
        System.out.println("max float is" + floatMax);

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("min Double is:" + floatMin);
        System.out.println("max Double is" + floatMax);

        int intVal = 5 / 2;
        float floatVal = 2f / 2;
        double doubleVal = 5 / 2;

        System.out.println("My int value:" + intVal);
        System.out.println("My float value:" + floatVal);
        System.out.println("My double value:" + doubleVal);

        // Challenge
        System.out.println("Challenge: convert given number of pounds to kilograms");
        double pounds = 10;
        double kilo = pounds * 0.45359237;
        System.out.println(kilo);



    }
}
