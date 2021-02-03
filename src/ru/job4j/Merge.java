package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int i=0, j=0;

        for (int k=0; k<rsl.length; k++) {

            if (i > left.length-1) {
                int a = right[j];
                rsl[k] = a;
                j++;
            }
            else if (j > right.length-1) {
                int a = left[i];
                rsl[k] = a;
                i++;
            }
            else if (left[i] < right[j]) {
                int a = left[i];
                rsl[k] = a;
                i++;
            }
            else {
                int b = right[j];
                rsl[k] = b;
                j++;
            }
        }

        return rsl;
    }

    public static void main(String[] args) {
        int[] rsl = merge(new int[]{21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500}, new int[]{10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000});
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}

