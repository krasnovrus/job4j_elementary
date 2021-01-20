package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int j = index + 1;
                for (int i = j; i < array.length; i++) {
                    if (array[i] != null) {
                        array[i - 1] = array[i];
                        array[i] = null;
                    }
                }
            }
        }
        for (int ind = 0; ind < array.length; ind++) {
            if (array[ind] == null) {
                int k = ind + 1;
                for (int in = k; in < array.length; in++) {
                    if (array[in] != null) {
                        array[in - 1] = array[in];
                        array[in] = null;
                    }

                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}