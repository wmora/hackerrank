package com.wmora.hackerrank.algorithms.implementation;

/**
 * Watson gives two integers (AA and BB) to Sherlock and asks if he can count the number of square integers between
 * A and B (both inclusive).
 * <p>
 * Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some
 * of the square integers as they are squares of 1, 2, 3, and 4, respectively.
 * <p>
 * Input Format
 * The first line contains T, the number of test cases. TT test cases follow, each in a new line.
 * Each test case contains two space-separated integers denoting AA and BB.
 * <p>
 * Output Format
 * For each test case, print the required answer in a new line.
 * <p>
 * Constraints
 * 1≤T≤100
 * 1≤A≤B≤10^9
 * <p>
 * Sample Input
 * <p>
 * 2
 * 3 9
 * 17 24
 * Sample output
 * <p>
 * 2
 * 0
 * Explanation
 * Test Case #00: In range [3,9], 4 and 9 are the two square numbers.
 * Test Case #01: In range [17,24], there are no square numbers.
 */
class SherlockAndSquares {

    static int squaresInIntegers(int a, int b) {
        int squares = 0;

        for (int i = a; i <= b; i++) {
            double squareRoot = Math.sqrt(i);
            if (squareRoot == Math.floor(squareRoot)) {
                squares++;
                i = (int) Math.pow(squareRoot + 1, 2) - 1;
            }
        }

        return squares;
    }

}
