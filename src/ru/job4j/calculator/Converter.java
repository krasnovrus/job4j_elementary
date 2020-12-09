package ru.job4j.calculator;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(200);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " dollar.");

            //Тест для программы//

            int in_e = 140; //Входное значение//
            int expected_e = 2; //Ожидаемое значение//
            int out_e = Converter.rubleToEuro(in_e); //Результат работы программы//
            boolean passed_e = expected_e == out_e; //Результат сравнения переменных expected_e и out_e//
            System.out.println("140 rubles are 2 euro. Test result : " + passed_e);

            int in_d = 200;
            int expected_d = 3;
            int out_d = Converter.rubleToDollar(in_d);
            boolean passed_d = expected_d == out_d;
            System.out.println("200 rubles are 3 dollar. Test result : " + passed_d);
        }
    }