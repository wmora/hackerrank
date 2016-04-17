package com.wmora.hackerrank.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SherlockAndTheBeastTest {

    @Test
    public void largestDecentNumberTestCase1() {
        assertTrue(SherlockAndTheBeast.largestDecentNumber(1).equals("-1"));
    }

    @Test
    public void largestDecentNumberTestCase2() {
        assertTrue(SherlockAndTheBeast.largestDecentNumber(3).equals("555"));
    }

    @Test
    public void largestDecentNumberTestCase3() {
        assertTrue(SherlockAndTheBeast.largestDecentNumber(5).equals("33333"));
    }

    @Test
    public void largestDecentNumberTestCase4() {
        assertTrue(SherlockAndTheBeast.largestDecentNumber(11).equals("55555533333"));
    }

}
