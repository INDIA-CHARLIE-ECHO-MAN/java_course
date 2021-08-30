package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Final score is: " + highScore);

        highScore = calculateScore(false, 10000, 8, 200);
        System.out.println("Final score is: " + highScore);
        */
        int player1Position = calculateHighScorePosition(1500);
        int player2Position = calculateHighScorePosition(900);
        int player3Position = calculateHighScorePosition(400);
        int player4Position = calculateHighScorePosition(50);
        displayHighScorePosition("player1", player1Position);
        displayHighScorePosition("player2", player2Position);
        displayHighScorePosition("player3", player3Position);
        displayHighScorePosition("player4", player4Position);




    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;

    }

    public static int calculateHighScorePosition(int score){
        if (score > 1000) {
            return 1;
        }
        else if (score > 500 && score < 1000) {
            return 2;
        }
        else if (score > 100 && score < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String name, int pos) {
        System.out.println(name + " managed to get into position" + pos);
    }



}
