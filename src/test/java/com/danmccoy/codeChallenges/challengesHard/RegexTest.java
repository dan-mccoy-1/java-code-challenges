package com.danmccoy.codeChallenges.challengesHard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegexTest {
    @Test
    public void test01() {
        assertEquals(true, Regex.validate("544466"));
    }

    @Test
    public void test02() {
        assertEquals(true, Regex.validate("121317"));
    }

    @Test
    public void test03() {
        assertEquals(false, Regex.validate("4512a5"));
    }

    @Test
    public void test04() {
        assertEquals(true, Regex.validate("123456"));
    }

    @Test
    public void test05() {
        assertEquals(false, Regex.validate(""));
    }

    @Test
    public void test06() {
        assertEquals(false, Regex.validate("21904"));
    }

    @Test
    public void test07() {
        assertEquals(true, Regex.validate("9451"));
    }

    @Test
    public void test08() {
        assertEquals(true, Regex.validate("213132"));
    }

    @Test
    public void test09() {
        assertEquals(false, Regex.validate(" 4520"));
    }

    @Test
    public void test10() {
        assertEquals(false, Regex.validate("15632 "));
    }

    @Test
    public void test11() {
        assertEquals(true, Regex.validate("000000"));
    }
}