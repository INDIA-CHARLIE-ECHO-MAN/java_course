package com.company;

public class Main {

    public static void main(String[] args) {
        if (hasEqualSum(1, 1, 1) == false) {
            System.out.println("false");
        }
        if (hasEqualSum(1, 1, 2)) {
            System.out.println("true");
        }
        if (hasEqualSum(-1, 1, 0)) {
            System.out.println("true");
        }
    }
    public static boolean hasEqualSum(int first, int second, int third) {
        if ((first + second) == third) {
            return true;
        }
        return false;
    }
}
