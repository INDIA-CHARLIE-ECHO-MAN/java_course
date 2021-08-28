package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "string";
        System.out.println("mystring actually means: " + myString);
        myString = myString + "and more strings";
        System.out.println("now it is " + "\u00A9 " + myString);
        String numStr = "250.99";
        String numStr2 = "1000";
        String sum = numStr + numStr2;
        System.out.println(sum);
    }
}
