package com.wmora.hackerrank.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridSearchTest {

    @Test
    public void gridSearchTest1() {
        String[] grid = new String[10];
        grid[0] = "7283455864";
        grid[1] = "6731158619";
        grid[2] = "8988242643";
        grid[3] = "3830589324";
        grid[4] = "2229505813";
        grid[5] = "5633845374";
        grid[6] = "6473530293";
        grid[7] = "7053106601";
        grid[8] = "0834282956";
        grid[9] = "4607924137";
        String[] pattern = new String[3];
        pattern[0] = "9505";
        pattern[1] = "3845";
        pattern[2] = "3530";

        assertEquals("YES", GridSearch.solution(grid, pattern));
    }

    @Test
    public void gridSearchTest2() {
        String[] grid = new String[15];
        grid[0] = "400453592126560";
        grid[1] = "114213133098692";
        grid[2] = "474386082879648";
        grid[3] = "522356951189169";
        grid[4] = "887109450487496";
        grid[5] = "252802633388782";
        grid[6] = "502771484966748";
        grid[7] = "075975207693780";
        grid[8] = "511799789562806";
        grid[9] = "404007454272504";
        grid[10] = "549043809916080";
        grid[11] = "962410809534811";
        grid[12] = "445893523733475";
        grid[13] = "768705303214174";
        grid[14] = "650629270887160";
        String[] pattern = new String[2];
        pattern[0] = "99";
        pattern[1] = "99";

        assertEquals("NO", GridSearch.solution(grid, pattern));
    }

    @Test
    public void gridSearchTest3() {
        String[] grid = new String[4];
        grid[0] = "123412";
        grid[1] = "561212";
        grid[2] = "123634";
        grid[3] = "781288";
        String[] pattern = new String[2];
        pattern[0] = "12";
        pattern[1] = "34";

        assertEquals("YES", GridSearch.solution(grid, pattern));
    }

}
