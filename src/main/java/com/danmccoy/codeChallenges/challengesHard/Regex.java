package com.danmccoy.codeChallenges.challengesHard;

import com.danmccoy.codeChallenges.constants.Constants;

import java.util.Arrays;

public class Regex {

    public Regex() {
        String pin0 = "123";    // not valid
        String pin1 = "1234";   // valid
        String pin2 = "123456"; // valid
        String pin3 = "12345";  // not valid
        String pin4 = "123h";   // not valid
        String pin5 = "12 45";  // not valid
        String selectedPin = pin5;
        Boolean isValid = validate(selectedPin);
        printResults(selectedPin, isValid);
    }

    //**********************************************************//
    //******************** Challenge Code **********************//
    //**********************************************************//
    // https://edabit.com/challenge/sCP58J9vcexchgwo7
    // Create a function that will test if a string is a valid PIN or not via a regular expression.
    // A valid PIN has:
    // - Exactly 4 or 6 characters.
    // - Only numeric characters (0-9).
    // - No whitespace.
    public static boolean validate(String pin) {
        String regex = "^(\\d{4}|\\d{6})$";
        return pin.matches(regex);
    }
    //**********************************************************//
    //**********************************************************//

    private static void printResults(String pin, Boolean isValid) {
        System.out.println(Constants.DIVIDER);
        System.out.println("Regex:");
        System.out.println("Pin: " + pin);
        System.out.println("Valid?: " + isValid);
        System.out.println(Constants.DIVIDER);
    }
}
