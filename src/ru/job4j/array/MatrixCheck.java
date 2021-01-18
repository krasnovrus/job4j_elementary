package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }

            }

        return result;
    }

    public static void main(String[] args) {
    char[][] num = new char[][] {
            {'4', '3', 'X'},
            {'X', 'X', 'X'},
            {'X', 'F', 'D'}
        };
        boolean rsl = monoHorizontal(num,1);
        System.out.println(rsl);
    }
}