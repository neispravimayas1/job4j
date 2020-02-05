package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int high = p/(2*(k+1));
        int length = high*k;
        return length*high;
    }
    public static void main(String[] args) {
        double result = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}