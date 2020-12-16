package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second>result) {
            result = second;
        }
        if (third>result) {
            result = third;
        }

        return result;
    }
    public static void main (String[] args) {
        System.out.println(max(22,13,14));
        System.out.println(max(12,23,11));
        System.out.println(max(12,12,12));
        System.out.println(max(12,13,122));

    }
}
