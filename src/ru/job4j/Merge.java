package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[count++] = right[j];
        }

        return rsl;
    }

    public static void main(String[] args) {
        int[] rsl = merge(new int[]{4, 5, 6, 7, 8}, new int[]{3, 4, 5, 6, 7, 8});
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}

