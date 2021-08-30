package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean res = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        if (res == false) {
            System.out.println("false");
        }
        res = areEqualByThreeDecimalPlaces(2.00, 1.501);
        if (res == false) {
            System.out.println("false");
        }
        res = areEqualByThreeDecimalPlaces(3.0, 3.0);
        if (res == true) {
            System.out.println("true");
        }
        res = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        if (res == false) {
            System.out.println("false");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        first = (double)Math.round(first * 1000d) / 1000d;
        second = (double)Math.round(second * 1000d) / 1000d;
        if (first == second) {
            return true;
        }
        return false;
    }
}
