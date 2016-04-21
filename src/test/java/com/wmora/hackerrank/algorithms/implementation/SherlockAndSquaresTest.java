package com.wmora.hackerrank.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SherlockAndSquaresTest {

    @Test
    public void squaresInIntegersTest() {
        assertEquals(0, SherlockAndSquares.squaresInIntegers(17, 24));
    }

    @Test
    public void squaresInIntegersTest2() {
        assertEquals(2, SherlockAndSquares.squaresInIntegers(3, 9));
    }

    @Test
    public void squaresInIntegersTest3() {
        assertEquals(31621, SherlockAndSquares.squaresInIntegers(3, (int) Math.pow(10, 9)));
    }

}
