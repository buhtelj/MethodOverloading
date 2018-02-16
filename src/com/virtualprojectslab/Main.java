package com.virtualprojectslab;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double lenghtInCentimeters = calcFeetAndinchesToCentimeters(5d, 8d);
        System.out.println("Lenght is " + lenghtInCentimeters + " cm");

        double newlenghtInCentimeters = calcFeetAndinchesToCentimeters(68);
        System.out.println("Lenght is " + newlenghtInCentimeters + " cm");


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }

    //naloga



    public static double calcFeetAndinchesToCentimeters(double myFeet, double myInches){
        if ((myFeet < 0) || (myInches < 0 || myInches > 12)) {
            return -1;
        }
            double myCentimeters = (myFeet * 12 + myInches) * 2.54;
            return myCentimeters;

    }

    public static double calcFeetAndinchesToCentimeters(int myInches){
        if (myInches < 0) {
            return -1;
        }
            int myInchRemainder = (myInches % 12);
            int myFeet = (myInches - myInchRemainder) / 12;
            return calcFeetAndinchesToCentimeters(myFeet, myInchRemainder);


    }



}
