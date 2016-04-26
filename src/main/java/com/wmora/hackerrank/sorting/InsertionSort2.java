package com.wmora.hackerrank.sorting;

class InsertionSort2 {

    static int[] insertionSortPart2(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int unsortedValue = ar[i];
            for (int j = i; j >= 0; j--) {
                if (j == 0 || unsortedValue > ar[j - 1]) {
                    ar[j] = unsortedValue;
                    break;
                }
                ar[j] = ar[j - 1];
            }
            printArray(ar);
        }
        return ar;
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
