package ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(5, 10));
    }
}