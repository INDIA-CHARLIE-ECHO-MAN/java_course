package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Alien is false");
        // no code block means if statement will only execute one line of code for the if statement

        if (isAlien == true);   // adding ; forces the statement to be true
        System.out.println("Alien is true");

        // better if else syntax using code block
        if (isAlien == true) {
            System.out.println("it is alien");
        }
        // going to skip content since i already know it
        if (isAlien) { // if isAlien is true
            System.out.println("hello");
        }
        if (!isAlien) { // if isAlien is false
            System.out.println("sike");
        }

        // ternary operator
        boolean notAlien = isAlien ? false : true;
        // operator means if isAlien is true, set notALien to false, otherwise set notAlien to true


        if (notAlien)
            System.out.println("it is true");
        else{
            System.out.println("it was false");
        }


    }




}
