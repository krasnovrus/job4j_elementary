package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap2to6() {
        int[] input = {3, 2, 6, 45, 34, 56, 77, 34, 67, 24};
        int[] expect = {3, 2, 77, 45, 34, 56, 6, 34, 67, 24};
        int[] rsl = SwitchArray.swap(input, 2, 6);
        assertThat(rsl, is(expect));
    }
}