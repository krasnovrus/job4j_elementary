package ru.job4j.loop;

import ru.job4j.Loop.CheckPrimeNumber;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count += 1;
            }
               }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(calc(67));
    }
}