package com.wmora.hackerrank.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolateFeastTest {

    @Test
    public void testChocolateFeast() {
        assertEquals(6, ChocolateFeast.howManyChocolates(10, 2, 5));
    }

    @Test
    public void testChocolateFeast2() {
        assertEquals(3, ChocolateFeast.howManyChocolates(12, 4, 4));
    }

    @Test
    public void testChocolateFeast3() {
        assertEquals(5, ChocolateFeast.howManyChocolates(6, 2, 2));
    }
}
