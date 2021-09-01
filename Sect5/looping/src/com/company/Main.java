package com.company;

public class Main {

    public static void main(String[] args) {
        // for loop:
        // for(init; termination; increment)
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }

    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
