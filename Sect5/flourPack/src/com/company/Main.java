package com.company;

public class Main {

    public static void main(String[] args) {
        if (canPack(1,0,4) == false) {
            System.out.println("1 works");
        }
        if (canPack(0,5,4) == true) {
            System.out.println("2 works");
        }
        if (canPack(2,2,11) == true) {
            System.out.println("3 works");
        }
        if (canPack(-3,2,12) == false) {
            System.out.println("4 works");
        }

        assert canPack(1,0,4) == false;
        assert (canPack(0,5,4) == true);
        assert (canPack(2,2,11) == true);
        assert (canPack(-3,2,12) == false);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigConvert = bigCount * 5;
        int total = bigConvert + smallCount;
        if (total > goal) {
            if (bigCount > 0) {
                int remainder = total % bigCount;
                if (smallCount > 0) {
                    return remainder % smallCount == 0;
                }
            }
            // checker if no bigCount
            if (smallCount > 0) {
                return total % smallCount == 0;
            }
            return false;
        }
        return false;
    }
}






