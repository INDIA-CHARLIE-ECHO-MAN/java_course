package com.company;

public class Main {

    public static void main(String[] args) {
        boolean ret = shouldWakeUp(true, 1);

	    if (ret == true) {
            System.out.println("true");
        }
        ret = shouldWakeUp(false, 2);
        if (ret == false) {
            System.out.println("false");
        }
        ret = shouldWakeUp(true, 8);
        if (ret == false) {
            System.out.println("false");
        }
        ret = shouldWakeUp(true, -1);
        if (ret == false) {
            System.out.println("false");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }

}
