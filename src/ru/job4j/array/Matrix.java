package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table[row].length; cell++) {
                table[row][cell] = (row+1) * (cell+1);
            }
        }
        return table;
    }

    public static void main(String[] args) {

        int[][] matrix = multiple(9);
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cells = 0; cells < matrix[rows].length; cells++) {
                System.out.print(matrix[rows][cells] + " ");
            }
            System.out.println();
        }
    }
}
