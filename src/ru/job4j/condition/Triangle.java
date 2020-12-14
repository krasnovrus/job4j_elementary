package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean first = ab + ac > bc;
        boolean second = ac + bc > ab;
        boolean third = ab + bc > ac;
        if (first && second && third) {
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

