package ru.job4j.calculator;


public class Test {

    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {
        System.out.println(exist(2.0, 2.0, 2.0));
        System.out.println(exist(10.0, 10.0, 22.0));
    }
}

