package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        long miles = toMilesPerHour(1.5);
        System.out.println(miles);
        miles = toMilesPerHour(10.25);
        System.out.println(miles);
        miles = toMilesPerHour(-5.6);
        System.out.println(miles);
        miles = toMilesPerHour(25.42);
        System.out.println(miles);
        miles = toMilesPerHour(75.114);
        System.out.println(miles);
         */

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double miles = kilometersPerHour / 1.609;
        miles = Math.round(miles);
        return (long)miles;
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if (miles == -1) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
    }

}
