package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return (left[left.length-1] == right[right.length-1]);
    }

    public static void main(String[] args) {
        int[] left = new int[] {4, 5, 7, 8};
        int[] right = new int[] {5, 4, 3, 9};
        boolean rsl = check(left, right);
        System.out.println(rsl);

    }
}
