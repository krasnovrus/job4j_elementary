package ru.job4j;

public class Main {

    public static void main(String[] args) {
        float inRublesToEuro = 140;
        float inRublesToDollar = 240;
        float expectedEuro = 2;
        float expectedDollar = 3;
        float outOne = Converter.rubleToEuro(inRublesToEuro);
        boolean passed = expectedEuro == outOne;
        float oneTwo = Converter.rubleToDollar(inRublesToDollar);
        boolean passedTwo = expectedDollar == oneTwo;
        System.out.println("Test is " + passed);
        System.out.println("Test Two is " + passedTwo);

    }
}