package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical (char[][] board, int column) {
     boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X'){
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;

    }

    public static void main(String[] args) {
    char[][] num = new char[][] {
            {'5', '3', '4'},
            {'t', '4', 't'},
            {'r', 'X', ';'}
        };
        char[] rsl = extractDiagonal(num);
        System.out.println(rsl);
    }
}