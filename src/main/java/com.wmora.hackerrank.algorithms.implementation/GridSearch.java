package com.wmora.hackerrank.algorithms.implementation;

/**
 * Given a 2D array of digits, try to find the occurrence of a given 2D pattern of digits.
 */
class GridSearch {

    static String solution(String[] grid, String[] pattern) {

        for (int i = 0; i <= grid.length - pattern.length; i++) {
            int patternIndex = grid[i].indexOf(pattern[0]);
            while (patternIndex > -1) {
                boolean patternExists = true;
                for (int j = 0; j < pattern.length; j++) {
                    if (!grid[i + j].substring(patternIndex).startsWith(pattern[j])) {
                        patternExists = false;
                        break;
                    }
                }
                if (patternExists) {
                    return "YES";
                }
                patternIndex = grid[i].indexOf(pattern[0], patternIndex + 1);
            }
        }

        return "NO";
    }
}
