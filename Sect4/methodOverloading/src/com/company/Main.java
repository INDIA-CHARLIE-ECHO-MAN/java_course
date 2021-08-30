package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("mark", 500);
        System.out.println("New score is " + newScore);
        calculateScore(5);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // overloading method take same method, change parameter and you can reuse the method name.
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return 0;
    }

    // overloading methods require same name, parameters and datatype
    // public static void would not work
}
