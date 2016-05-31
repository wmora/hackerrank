package com.wmora.hackerrank.algorithms.implementation;

class ChocolateFeast {

    static int howManyChocolates(int cash, int price, int wrappers) {
        int chocolatesBought = cash / price;
        int freeChocolates = chocolatesBought / wrappers;
        int wrappersLeft = freeChocolates + (chocolatesBought % wrappers);

        while (wrappersLeft >= wrappers) {
            int free = wrappersLeft / wrappers;
            freeChocolates += free;
            wrappersLeft = (wrappersLeft % wrappers) + free;
        }

        return chocolatesBought + freeChocolates;
    }

}
