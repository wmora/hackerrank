package com.wmora.hackerrank.algorithms.implementation;

/**
 * Given an integer, N, traverse its digits (d1,d2,...,dn) and determine how many digits evenly divide N
 * (i.e.: count the number of times N divided by each digit di has a remainder of 0). Print the number of evenly
 * divisible digits.
 *
 * Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be
 * counted (i.e.: for N=111, the answer is 3).
 *
 * Input Format
 *
 * The first line is an integer, TT, indicating the number of test cases.
 * The TT subsequent lines each contain an integer, NN.
 *
 * Constraints
 * 1≤T≤15
 * 0<N<109
 *  Output Format
 *
 * For every test case, count and print (on a new line) the number of digits in NN that are able to evenly divide NN.
 */
class FindDigits {

    static int findDigits(int n) {
        int[] digitsArray = integerToArray(n);

        int evenlyDivisibleDigits = 0;

        for (int i = 0; i < digitsArray.length; i++) {

            int digit = digitsArray[i];

            if (digit > 0 && n % digit == 0) {
                evenlyDivisibleDigits++;
            }
        }

        return evenlyDivisibleDigits;
    }

    private static int[] integerToArray(int n) {
        int[] digitsArray = new int[numberOfDigits(n)];

        int i = 0;
        while(n > 0) {
            digitsArray[i] = n % 10;
            n /= 10;
            i++;
        }

        return digitsArray;
    }

    private static int numberOfDigits(int number) {
        return String.valueOf(number).length();
    }

}
