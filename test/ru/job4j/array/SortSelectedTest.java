package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortSec() {
        int[] input = new int[] {9, 5, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {4, 5, 9};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortTh() {
        int[] input = new int[] {-14, 24, 67, -45, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-45, -14, 5, 24, 67};
        assertThat(result, is(expect));
    }
}