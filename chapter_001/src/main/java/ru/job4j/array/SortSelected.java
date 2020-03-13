package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            int min = MinDiapason.findMin(data, i+1, data.length);// мин элемент
            int index = FindLoop.indexOf(data, min, i+1, data.length); // мин индекс
            if (data[index] < data[i]) {
                int tmp = data[i];
                data[i] = data[index];
                data[index] = tmp;
            }
                }
        return data;
    }
}