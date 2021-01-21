package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int change = money - price;
        if (change != 0) {
            for (int i = 0; i < coins.length; i++) {
                while (change - coins[i] >= 0) {
                    change -= coins[i];
                    rsl[size++] = coins[i];
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
    }
}