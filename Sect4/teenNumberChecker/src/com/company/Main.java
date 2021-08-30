package com.company;

public class Main {

    public static void main(String[] args) {
	    // first only
        if (hasTeen(13, 12, 10)) {
            System.out.println("true");
        }
        // second only
        if (hasTeen(10, 15, 25)) {
            System.out.println("true");
        }
        // third only
        if (hasTeen(5, 43, 19)) {
            System.out.println("true");
        }
        // first two
        if (hasTeen(13, 15, 100)) {
            System.out.println("true");
        }
        // all of them
        if (hasTeen(14, 14, 14)) {
            System.out.println("true");
        }
        // false: none of them
        if (!hasTeen(100, 20, 12)) {
            System.out.println("false");
        }
     }

    public static boolean hasTeen(int first, int second, int third) {
        return checker(first) || checker(second) || checker(third);
    }
    public static boolean checker(int value) {
        return value <= 19 && value >= 13;
    }
}
