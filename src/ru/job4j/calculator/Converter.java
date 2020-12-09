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

            int inE = 140; //Входное значение//
            int expectedE = 2; //Ожидаемое значение//
            int outE = Converter.rubleToEuro(inE); //Результат работы программы//
            boolean passedE = expectedE == outE; //Результат сравнения переменных expected_e и out_e//
            System.out.println("140 rubles are 2 euro. Test result : " + passedE);

            int inD = 200;
            int expectedD = 3;
            int outD = Converter.rubleToDollar(inD);
            boolean passedD = expectedD == outD;
            System.out.println("200 rubles are 3 dollar. Test result : " + passedD);
        }
    }