package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To4Then7() {
        int left = 7;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To3Then3() {
        int left = 2;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5to3to2Then5() {
        int first = 5;
        int second = 3;
        int thrid = 2;
        int result = Max.max(first, second, thrid);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5to3to2to8Then8() {
        int first = 5;
        int second = 3;
        int thrid = 2;
        int four = 8;
        int result = Max.max(first, second, thrid, four);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}