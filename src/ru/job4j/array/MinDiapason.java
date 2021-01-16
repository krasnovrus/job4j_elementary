package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
    public static void main(String[] args) {
     int[] num = new int[] {4, 3, 6, 7, -1, -6};
     int rsl = findMin(num, 1, 3);
        System.out.println(rsl);
    }
}
