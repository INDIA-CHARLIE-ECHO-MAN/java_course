package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(100, 59));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainMin = minutes % 60;
        return hours + "h " + remainMin + "m " + seconds + "s";
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainSeconds = seconds % 60;
        return getDurationString(minutes, remainSeconds);
    }
}
