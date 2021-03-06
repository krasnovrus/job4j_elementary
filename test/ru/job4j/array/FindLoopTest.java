package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOfRange(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind12() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 12;
        int start = 3;
        int finish = 9;
        int result = FindLoop.indexOfRange(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}