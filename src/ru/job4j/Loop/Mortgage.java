package ru.job4j.Loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        // amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
        int year = 0;
        percent = percent/100;
        while (amount > 0) {
            amount = amount + (amount * percent) - salary;
            year++;
        }
        return year;
    }
    public static void main (String[] args) {
         }
}
