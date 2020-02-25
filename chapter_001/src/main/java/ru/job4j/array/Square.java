package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = index * index;
        }
        return rst;
    }
    public static void main(String[] args) {
        int[] array = calculate(3);
        int[] array1 = calculate(5);
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array1.length; index1++) {
              }
        }
    }
}
