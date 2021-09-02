package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter date:");
        int date = scanner.nextInt();

        scanner.nextLine(); // supposed to handle reading the enter key

        System.out.println("Date is: " + date);



        System.out.println("Your name is: " + name);





        scanner.close();
    }
}
