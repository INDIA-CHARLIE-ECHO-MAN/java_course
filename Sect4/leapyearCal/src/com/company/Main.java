package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean res;
        res = isLeapYear(1700);
        if (res == false) {
            System.out.println("false");
        }
        res = isLeapYear(1600);
        if (res == true) {
            System.out.println("true");
        }
        res = isLeapYear(1900);
        if (res == false) {
            System.out.println("false");
        }

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
