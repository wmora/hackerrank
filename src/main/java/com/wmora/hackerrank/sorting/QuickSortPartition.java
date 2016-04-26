package com.wmora.hackerrank.sorting;

import java.util.ArrayList;
import java.util.List;

class QuickSortPartition {

    static int[] partition(int[] ar) {
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int pivot = 0;

        for (int i : ar) {
            if (i < ar[pivot]) {
                left.add(i);
            } else if (i == ar[pivot]) {
                equal.add(i);
            } else if (i > ar[pivot]) {
                right.add(i);
            }
        }

        ar = new int[ar.length];

        addListToArray(ar, left, 0);
        addListToArray(ar, equal, left.size());
        addListToArray(ar, right, left.size() + equal.size());

        return ar;
    }

    private static void addListToArray(int[] array, List<Integer> list, int fromIndex) {
        for (Integer i : list) {
            array[fromIndex++] = i;
        }
    }

}
