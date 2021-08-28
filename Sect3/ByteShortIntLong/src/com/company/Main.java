package com.company;

public class Main {

    public static void main(String[] args) {
        // 32 bit
        int myValue = 10000;
        // following is example of Wrapper class
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myOverFlowIntValue = Integer.MAX_VALUE + 1;
        System.out.println("Integer Min is: " + myMinIntValue);
        System.out.println("Integer Max is: " + myMaxIntValue);
        System.out.println("Integer Over flow is:" + myOverFlowIntValue);

        // 8 bit
        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;
        System.out.println(myMaxByteVal);
        System.out.println(myMinByteVal);

        // 16 bit
        short myMinShortVal = Short.MIN_VALUE;
        short myMaxShortVal = Short.MAX_VALUE;
        System.out.println(myMaxShortVal);
        System.out.println(myMinShortVal);

        // 64 bit
        long myMinLongVal = Long.MIN_VALUE;
        long myMaxLongVal = Long.MAX_VALUE;
        System.out.println(myMaxLongVal);
        System.out.println(myMinLongVal);



        int myTotal = (myMinIntValue/2);

        // type casting to resolve type errors
        // byte myNewByte = (myMaxByteVal / 2);
        // issue as it interprets the operation as an integer
        // hence the need to type cast it
        byte myNewByte = (byte) (myMaxByteVal / 2);


        // Challenge time
        System.out.println("Challenge time on primitive types");
        byte small = 100;
        short med = 200;
        int num = 300;
        long sum = 50000 + 10 * (small + med + num);
        System.out.println(sum);

    }
}
