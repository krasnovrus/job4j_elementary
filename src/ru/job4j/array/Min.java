package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index]<min) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = new int[] {4, 6, 78, -1, -345, 456};
        int rsl = findMin(num);
        System.out.println(rsl);
    }
}
