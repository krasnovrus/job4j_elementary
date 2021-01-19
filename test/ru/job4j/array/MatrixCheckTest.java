package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {'C', 'B', 'A'},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void WhenHasMonoVertical() {
        char[][] input = {
                {'C', 'B', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'I', 'J'},
                {'1', '2', '3', '4', '5'},
                {'6', '7', '8', '9', 'А'},
                {'Б', 'В', 'Г', 'Д', 'Е'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'A', 'G', '3', '9', 'Е'};
        assertThat(result, is(expect));
    }
}