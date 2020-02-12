package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second) {
        int result = first>second ? first : second;
        return result;
    }
    public int max(int first, int second, int  third) {
        int temp = max(second,third);
        return max(first, temp);
          }
}