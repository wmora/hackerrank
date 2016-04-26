package com.wmora.hackerrank.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class InsertionSort1Test {

    @Test
    public void insertIntoSortedTest() {
        assertTrue(Arrays.equals(new int[]{2, 3, 4, 6, 8}, InsertionSort1.insertIntoSorted(new int[]{2, 4, 6, 8, 3})));
    }

}
