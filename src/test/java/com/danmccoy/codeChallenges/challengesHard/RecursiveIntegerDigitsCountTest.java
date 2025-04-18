package com.danmccoy.codeChallenges.challengesHard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveRecursiveIntegerDigitsCountCountTest {
    @Test
    public void test01() {
        assertEquals(4, RecursiveIntegerDigitsCount.count(4666));
    }

    @Test
    public void test02() {
        assertEquals(3, RecursiveIntegerDigitsCount.count(544));
    }

    @Test
    public void test03() {
        assertEquals(1, RecursiveIntegerDigitsCount.count(0));
    }

    @Test
    public void test04() {
        assertEquals(3, RecursiveIntegerDigitsCount.count(318));
    }

    @Test
    public void test05() {
        assertEquals(5, RecursiveIntegerDigitsCount.count(-92563));
    }

    @Test
    public void test06() {
        assertEquals(6, RecursiveIntegerDigitsCount.count(314890));
    }

    @Test
    public void test07() {
        assertEquals(6, RecursiveIntegerDigitsCount.count(654321));
    }

    @Test
    public void test08() {
        assertEquals(6, RecursiveIntegerDigitsCount.count(638476));
    }

    @Test
    public void test09() {
        assertEquals(5, RecursiveIntegerDigitsCount.count(12345));
    }

    @Test
    public void test10() {
        assertEquals(7, RecursiveIntegerDigitsCount.count(1289396));
    }

    @Test
    public void test11() {
        assertEquals(7, RecursiveIntegerDigitsCount.count(-1232323));
    }

    @Test
    public void test12() {
        assertEquals(8, RecursiveIntegerDigitsCount.count(12839393));
    }

    @Test
    public void test13() {
        assertEquals(9, RecursiveIntegerDigitsCount.count(-231273683));
    }
}