package com.danmccoy.codeChallenges.challengesVeryHard;

import com.danmccoy.codeChallenges.constants.Constants;

import java.util.Arrays;

public class EncryptDecrypt {

    public EncryptDecrypt() {
        int[] encrypted = this.encrypt("Sonny Crockett and Ricardo Tubbs");
        String decrypted = this.decrypt(encrypted);
        printResults(encrypted, decrypted);
    };

    //**********************************************************//
    //******************** Challenge Code **********************//
    //**********************************************************//
    //https://edabit.com/challenge/KZrmicjc8zCZyGNee
    // Create two functions that take a string and an array and return a coded (function 1) and decoded (function 2) message.
    // The first letter of the string, or the first element of the array represents the Character Code of that letter.
    // The next elements are the differences between the characters: e.g. A +3 --> C or z -1 --> y.
    // Notes:
    //     - The input of the encrypt function will always be a string.
    //     - The input of the decrypt function will always be an array with numbers.
    // Examples:
    //     encrypt("Hello") ➞ [72, 29, 7, 0, 3]
    //     H = 72, the difference between the H and e is 29 (uppercase and lowercase).
    //     The difference between the two ls is obviously 0.
    //         decrypt([72, 33, -73, 84, -12, -3, 13, -13, -68]) ➞ "Hi there!"
    //         encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]
    public static int[] encrypt(String str) {
        char[] chars = str.toCharArray();
        int[] encrypted = new int[chars.length];
        int previousASCII = 0;
        for (int i = 0; i < chars.length; i++) {
            int currentASCII = convertCharToASCII(chars[i]);
            encrypted[i] = currentASCII - previousASCII;
            previousASCII = currentASCII;
        }
        return encrypted;
    };

    public static String decrypt(int[] ints) {
        StringBuilder decrypted = new StringBuilder();
        int previousSum = 0;
        for (int i : ints) {
            int currentSum = previousSum + i;
            decrypted.append(convertASCIIToString(currentSum));
            previousSum = currentSum;
        }
        return decrypted.toString();
    };

    public static int convertCharToASCII(char chr) {
        return chr;
    };

    public static String convertASCIIToString(int ascii) {
        return String.valueOf((char)ascii);
    };
    //**********************************************************//
    //**********************************************************//

    private static void printResults(int[] encrypted, String decrypted) {
        System.out.println(Constants.DIVIDER);
        System.out.println("EncodeDecode:");
        System.out.println("encrypted: " + Arrays.toString(encrypted));
        System.out.println("decrypted: " + decrypted);
        System.out.println(Constants.DIVIDER);
    }
}
