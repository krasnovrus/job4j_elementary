package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val < 0) {
                    array[row][cell] = 0;
                }
            }
        }
            return array;
    }

    public static void main(String[] args) {
     int[][] num = new int[][] {
             {2, 4, -2},
             {5, -43, 9}
     };
     int[][] matrix = skip(num);
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cells = 0; cells < matrix[rows].length; cells++) {
                System.out.println(matrix[rows][cells]);
            }
        }

    }
}

