package com.wmora.hackerrank.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptionTest {

    @Test
    public void encryptTest() {
        String input = "haveaniceday";
        String output = "hae and via ecy";
        assertEquals(output, Encryption.encrypt(input));
    }

    @Test
    public void encryptTest2() {
        String input = "feedthedog";
        String output = "fto ehg ee dd";
        assertEquals(output, Encryption.encrypt(input));
    }

    @Test
    public void encryptTest3() {
        String input = "chillout";
        String output = "clu hlt io";
        assertEquals(output, Encryption.encrypt(input));
    }

    @Test
    public void encryptTest4() {
        String input = "if man was meant to stay on the ground god would have given us roots";
        String output = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau";
        assertEquals(output, Encryption.encrypt(input));
    }

}
