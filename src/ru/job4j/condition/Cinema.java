package ru.job4j.condition;


public class Cinema {
    public static boolean permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println (permission(true, false));
        permission(true, true);
        permission(false, true);
        permission(false, false);
    }
}
