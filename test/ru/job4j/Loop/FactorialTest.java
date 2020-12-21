package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int n = 5;
        int expected = 120;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected,out);
    }
    @Test
    public void whenCalculateFactorialForZeroThensOne() {
        int n = 8;
        int expected = 40320;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected,out);
    }
}