package com.danmccoy.codeChallenges.challengesMedium;

import com.danmccoy.codeChallenges.constants.Constants;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OddVsEvenIntegersSumDifference {

    public OddVsEvenIntegersSumDifference() {
        int[] ints= {1, 2, 7, 19, 20, 43, 109, 112};
        int difference = warOfNumbers(ints);

        // We need to convert our array of ints into strings to print them
        String[] strings = new String[] {
                Arrays.stream(ints)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "))
        };
        printResults(strings, difference);
    }

    //**********************************************************//
    //******************** Challenge Code **********************//
    //**********************************************************//
    // https://edabit.com/challenge/Aofd78q72sAtgCyEY
    // "Create a function that takes an array of integers, sums the even and odd numbers separately,
    // then returns the difference between the sum of the even and odd numbers."
    public static int warOfNumbers(int[] numbers) {
        int evens = 0;
        int odds = 0;
        for(int n : numbers) {
            if (n % 2 == 0) {
                evens = evens + n;
            } else {
                odds = odds + n;
            }
        }
        int difference = Math.abs(evens - odds);
        return difference;
    }
    //**********************************************************//
    //**********************************************************//

    private static void printResults(String[] strings, int difference) {
        System.out.println(Arrays.toString(strings));
        System.out.println(Constants.DIVIDER);
        System.out.println("OddVsEvenIntegersSumDifference:");
        System.out.println("Difference: " + difference);
        System.out.println(Constants.DIVIDER);
    }
}
