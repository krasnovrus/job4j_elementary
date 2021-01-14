package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
    int[] array = new int[] {5,4,3,2,1};
    int a = indexOf(array, 9);
        for (int index = 0; index < a; index++) {
        }
        System.out.println(a);
        }
    }


