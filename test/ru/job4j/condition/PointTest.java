package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when05to37then36() {
        double expected = 3.6;
        int x1 = 0;
        int y1 = 5;
        int x2 = 3;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to60then707() {
        double expected = 7.07;
        int x1 = 1;
        int y1 = 5;
        int x2 = 6;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when70to98then824() {
        double expected = 8.24;
        int x1 = 7;
        int y1 = 0;
        int x2 = 9;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}