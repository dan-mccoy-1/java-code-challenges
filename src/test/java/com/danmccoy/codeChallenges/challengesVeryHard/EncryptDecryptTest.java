package com.danmccoy.codeChallenges.challengesVeryHard;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

class EncryptDecryptTest {
    @Test
    public void test1() {
        assertThat(EncryptDecrypt.encrypt("?"), is(new int[]{63}));
    }

    @Test
    public void test2() {
        assertEquals("The neighbours are strange..", EncryptDecrypt.decrypt(new int[]{84, 20,  -3,  -69,  78,  -9,  4,  -2,  1,  -6,  13,  6,  -3,  1,  -83,  65,  17,  -13,  -69,  83,  1,  -2,  -17,  13,  -7,  -2,  -55,  0}));
    }

    @Test
    public void test3() {
        assertThat(EncryptDecrypt.encrypt("It's a secret!"), is(new int[]{73, 43, -77, 76, -83, 65, -65, 83, -14, -2, 15, -13, 15, -83}));
    }

    @Test
    public void test4() {
        assertEquals("OK", EncryptDecrypt.decrypt(new int[]{79, -4 }));
    }

    @Test
    public void test5() {
        assertEquals("Tomorrow, 3 pm in the garden.", EncryptDecrypt.decrypt(new int[]{84, 27,  -2,  2,  3,  0,  -3,  8,  -75,  -12,  19,  -19,  80,  -3,  -77,  73,  5,  -78,  84,  -12,  -3,  -69,  71,  -6,  17,  -14,  1,  9,  -64 }));
    }

    @Test
    public void test6() {
        assertThat(EncryptDecrypt.encrypt("Sunshine"), is(new int[]{83, 34, -7, 5, -11, 1, 5, -9}));
    }
}