package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 1; i != 6; i++) {
            System.out.println("Count value is " + i);
        }

        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // do while implementation
        count = 1;
        // do will always execute at least once.
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

    }
}
