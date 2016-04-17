package com.wmora.hackerrank.algorithms.implementation;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class FindDigitsTest {

    @Test
    public void findDigitsTestCase1() {
        assertTrue(FindDigits.findDigits(12) == 2);
    }

    @Test
    public void findDigitsTestCase2() {
        assertTrue(FindDigits.findDigits(1012) == 3);
    }

}
