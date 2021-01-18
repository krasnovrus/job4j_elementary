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
    public static void main(String[] args) {
    char[][] num = new char[][] {
            {'4', 'X', 'X'},
            {'X', 'X', 'X'},
            {'X', 'X', 'D'}
        };
        boolean rsl = monoVertical(num,1);
        System.out.println(rsl);
    }
}