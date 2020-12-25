package ru.job4j.Loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 2; index <= number-1; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            } else {
                prime = true;
                break;
        }
        }
          return prime;
    }
    public static void main (String [] args) {
        System.out.println(check(47));
           }
}
