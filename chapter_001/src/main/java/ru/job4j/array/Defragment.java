package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                int point = index;// указатель, на не null ячейку.
                array[point] = array[index + 1];//переместить первую не null
                array[index + 1] = array [point];
                while (array [point]==null){
                System.out.print(array[index] + " ");
            }}
        }
            return array;
        }
        public static void main (String[]args){
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int i = 0; i < compressed.length; i++) {
                System.out.print(compressed[i] + " ");
            }
        }
    }
