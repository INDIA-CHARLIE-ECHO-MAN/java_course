package com.company;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        if (megabytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int remain = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remain + " KB");

    }

}
