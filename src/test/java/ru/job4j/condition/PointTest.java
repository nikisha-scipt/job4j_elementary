package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point x = new Point(0, 0);
        Point y = new Point(2, 0);
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to00then2() {
        double expected = 2;
        Point x = new Point(0, 2);
        Point y = new Point(0, 0);
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to23then2dot83() {
        double expected = 2.83;
        Point x = new Point(0, 1);
        Point y = new Point(2, 3);
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when4355to2232then31dot14() {
        double expected = 31.14;
        Point x = new Point(43, 55);
        Point y = new Point(22, 32);
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

}