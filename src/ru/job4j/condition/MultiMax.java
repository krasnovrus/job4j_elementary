package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }
        if (result > third) {
            result = result;
        } else {
            result = third;
        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println(max(22,13,14));
        System.out.println(max(12,23,11));
        System.out.println(max(12,23,34));
        System.out.println(max(12,12,12));
    }
}
