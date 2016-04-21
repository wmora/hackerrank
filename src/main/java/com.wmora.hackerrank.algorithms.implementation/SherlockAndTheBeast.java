package com.wmora.hackerrank.algorithms.implementation;

/**
 * Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical.
 * Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their
 * supercomputer, The Beast.
 * <p>
 * Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting
 * The Beast with a virus; however, he also gives him a clue—a number, NN. Sherlock determines the key to removing
 * the virus is to find the largest Decent Number having NN digits.
 * <p>
 * A Decent Number has the following properties:
 * <p>
 * Its digits can only be 3's and/or 5's.
 * The number of 3's it contains is divisible by 5.
 * The number of 5's it contains is divisible by 3.
 * If there are more than one such number, we pick the largest one.
 * Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!
 * <p>
 * Constraints
 * 1 ≤ T ≤ 20
 * 1 ≤ N ≤ 100000
 * <p>
 * Input Format
 * <p>
 * The first line is an integer, TT, denoting the number of test cases.
 * <p>
 * The TT subsequent lines each contain an integer, NN, detailing the number of digits in the number.
 * <p>
 * Output Format
 * <p>
 * Print the largest Decent Number having NN digits; if no such number exists, tell Sherlock by printing -1.
 */
class SherlockAndTheBeast {

    static String largestDecentNumber(int digits) {
        StringBuffer stringBuffer = new StringBuffer();

        int fives = digits;

        while(fives >= 0) {
            if (isMultipleOf(fives, 3)) {
                break;
            }
            fives -= 5;
            stringBuffer.append("33333");
        }

        if (fives < 0) {
            return "-1";
        }

        for (int i = 0; i < fives; i += 3) {
            stringBuffer.insert(0, "555");
        }

        return stringBuffer.toString();
    }

    private static boolean isMultipleOf(int number, int divider) {
        return number % divider == 0;
    }

}
