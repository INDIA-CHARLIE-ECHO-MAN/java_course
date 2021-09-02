package com.company;

public class Main {

    public static void main(String[] args) {
	    printSquareStar(5);
        printSquareStar(8);
    }
    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        number--;
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                if (i == 0 || i == number  || j == 0 || j == number || i == j || i == number - j || j == number) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
