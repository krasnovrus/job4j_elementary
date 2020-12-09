package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = ru.job4j.condition.SqArea.square(p,k);
        Assert.assertEquals(expected,out, 0.01);
    }
}