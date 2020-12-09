package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180then92() {
        Short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenWoman170then69() {
        Short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }
}