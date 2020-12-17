package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > result) {
            result = first;
        }
        if (second > result) {
            result = second;
        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println(max(108,10,1));

    }
}
