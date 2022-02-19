package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int expected = 120;
        int res = Factorial.calc(in);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int res = Factorial.calc(in);
        Assert.assertEquals(res, expected);
    }

}