package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        String name = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDay4() {
        String name = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}