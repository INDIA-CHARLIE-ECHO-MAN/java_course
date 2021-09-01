package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);


        // turns string into int, provided there are no other characters
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
        //  string to int conversion is same as string to double float etc.

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }

}
