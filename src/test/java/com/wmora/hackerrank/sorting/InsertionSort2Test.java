package com.wmora.hackerrank.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class InsertionSort2Test {

    @Test
    public void insertionSortTest1() {
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6},
                InsertionSort2.insertionSortPart2(new int[]{1, 4, 3, 5, 6, 2})));
    }

    @Test
    public void insertionSortTest2() {
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                InsertionSort2.insertionSortPart2(new int[]{9, 8, 6, 7, 3, 5, 4, 1, 2})));
    }

}
