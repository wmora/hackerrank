package com.wmora.hackerrank.sorting;

class InsertionSort1 {

    static int[] insertIntoSorted(int[] ar) {
        int unsortedNumber = ar[ar.length - 1];
        for (int i = ar.length - 1; i >= 0; i--) {
            int nextNumber = i == 0 ? 0 : ar[i - 1];
            ar[i] = unsortedNumber > nextNumber ? unsortedNumber : ar[i - 1];
            if (unsortedNumber == ar[i]) {
                break;
            }
        }
        return ar;
    }

}
