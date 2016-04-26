package com.wmora.hackerrank.sorting;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;


public class QuickSortPartitionTest {

    @Test
    public void partitionTest1() {
        assertTrue(Arrays.equals(new int[]{3, 2, 4, 5, 7}, QuickSortPartition.partition(new int[]{4, 5, 3, 7, 2})));
    }
}
