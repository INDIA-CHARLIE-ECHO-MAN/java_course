package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float count = 0;
        float average;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum = sum + scanner.nextInt();
                count++;
            }
            else {
                System.out.println("count is: " + count);
                average = sum / count;
                System.out.print("SUM = " + (int)sum + " AVG = " + average);
                break;
            }
        }
    }
}
