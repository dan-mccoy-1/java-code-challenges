package com.danmccoy.codeChallenges.challengesHard;

import com.danmccoy.codeChallenges.constants.Constants;

public class RecursiveIntegerDigitsCount {

    private static int digitCount;

    // Recursively counts the number of digits in an integer
    public RecursiveIntegerDigitsCount() {
        int integer = -754434544;
        count(integer); // I know this function returns a value (which the challenge requires), but I don't reference it as I don't need it
        printResults(integer);
    }

    //**********************************************************//
    //******************** Challenge Code **********************//
    //**********************************************************//
    // https://edabit.com/challenge/dreQhsnZJ7HGtsts5
    // "Create a function that recursively counts the integer's number of digits."
    public static int count(int n) {
        digitCount = 0;
        return actualCount(n);
    }

    private static int actualCount(int n) {
        digitCount++;
        int absoluteInt = Math.abs(n);
        // Math.floor returns a double, so we need to cast it as an int
        int tenthRoundedDown = (int)Math.floor(absoluteInt / 10);
        if(tenthRoundedDown >= 1){
            return actualCount(tenthRoundedDown);
        }
        System.out.println("digitCount: " + digitCount);
        return digitCount;
    }
    //**********************************************************//
    //**********************************************************//

    private static void printResults(int integer) {
        System.out.println(Constants.DIVIDER);
        System.out.println("RecursiveIntegerDigitsCount:");
        System.out.println("Integer: " + integer);
        System.out.println("Digit count: " + digitCount);
        System.out.println(Constants.DIVIDER);
    }
}
