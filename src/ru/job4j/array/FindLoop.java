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
    public static int indexOfRange(int[] data, int el, int start, int finish) {
        int rsl = -1; /* если элемента нет в массиве, то возвращаем -1, если есть, то индекс */
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
    int[] array = new int[] {5,4,5,2,1};
     int result = indexOfRange(array, 5, 1, 3);
        for (int index = 0; index < result; index++) {
        }
        System.out.println(result);
        }
    }


