package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iLeft = 0;
        int iRight = 0;
        for (int i=0; i < rsl.length;i++ ) {
            if (iLeft != left.length && iRight != right.length) {
                if (left[iLeft] < right[iRight]) {
                    rsl[i] = left[iLeft++];
                } else {
                    rsl[i] = right[iRight++];
            }
        }  else if (iLeft == left.length) {
                    rsl[i] = right[iRight++];
                } else rsl[i] = left[iLeft++];
    }
            return rsl;
        }
        public static void main (String[]args){
            Merge process = new Merge();
            int[] rsl = process.merge(
                    new int[]{1, 3, 5},
                    new int[]{2, 4}
            );
            System.out.println(Arrays.toString(rsl));
        }
    }

