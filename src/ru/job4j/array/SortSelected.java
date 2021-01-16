package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length-1);
            int index = FindLoop.indexOfRange(data, min, i, data.length);
            if (min < data[i]) {
                int temp = data[i];
                data[i] = min;
                data[index] = temp;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] num = new int[] {5, 4, 3, 2, 1};
        int[] rsl = sort(num);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }

    }
}
