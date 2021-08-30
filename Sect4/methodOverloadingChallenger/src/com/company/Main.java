package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(20, 10));
        System.out.println(calcFeetAndInchesToCentimeters(8, 4));
        System.out.println(calcFeetAndInchesToCentimeters(156));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ( feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double feetToInch = feet * 12;
        double totalInch = feetToInch + inches;
        return totalInch * 2.54;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0)
            return -1;

        // how many feet are in inches
        double feet = (int) inches / 12;
        double remainInch = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainInch);
    }
}
